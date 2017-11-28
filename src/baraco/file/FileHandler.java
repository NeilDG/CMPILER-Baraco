package baraco.file;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class FileHandler {

    private Stage stage;
    private File currentFile;

    public FileHandler(Stage stage) {
        this.stage = stage;
    }

    public String open() {
        File file = showFileChooser(true);

        if (file != null) {
            this.currentFile = file;
            return readFromCurrentFile();
        }

        return null;
    }

    public boolean save(String content) {

        if (this.currentFile != null) {
            writeToFile(content, this.currentFile);
            return true;
        }
        else {
            File selectedFile = showFileChooser(false);
            if (selectedFile != null) {
                this.currentFile = selectedFile;
                writeToFile(content, this.currentFile);
                return true;
            }
        }

        return false;
    }

    public boolean saveAs(String content) {

        File file = showFileChooser(false);
        if (file != null) {
            this.currentFile = file;
            return save(content);
        }

        return false;
    }

    public boolean newFile() {
        File selectedFile = showFileChooser(false);
        if (selectedFile != null) {
            this.currentFile = selectedFile;
            return true;
        }

        return false;
    }

    public File showFileChooser(boolean isOpen) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose " + (isOpen ? "Open" : "Save") + " Location");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Baraco files", "*.bara"),
                new FileChooser.ExtensionFilter("All Files", "*.*"));


        File selectedFile;

        if (isOpen) {
            selectedFile = fileChooser.showOpenDialog(this.stage);
        }
        else {
            selectedFile = fileChooser.showSaveDialog(this.stage);
        }

        return selectedFile;
    }

    private String readFromCurrentFile() {
        String content = "";

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(this.currentFile);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            String line = "";
            while((line = bufferedReader.readLine()) != null) {
                content += line + "\n";
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            this.currentFile.getName() + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + this.currentFile.getName() + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

        return content;
    }

    private boolean writeToFile(String content, File file) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return true;
    }

    public String getCurrentFileName() {
        if (this.currentFile != null) {
            return this.currentFile.getName();
        }
        else {
            return "";
        }
    }
}
