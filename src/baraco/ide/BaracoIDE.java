package baraco.ide;

import baraco.controller.Controller;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaracoIDE {
    private JPanel panelRoot;
    private JTextArea editor;
    private JButton buttonRun;
    private JTextArea console;
    private JScrollPane scrollPaneEditor;
    private JScrollPane scrollPaneConsole;
    private JButton buttonFile;
    private JButton buttonEdit;
    private JTextArea lineNumbers;
    private Controller controller;


    public BaracoIDE() {
        controller = new Controller(null);
        buttonRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = editor.getText().trim();
                controller.run(code);
            }
        });

        editor.getDocument().addDocumentListener(new DocumentListener(){
            public String getText(){
                int caretPosition = editor.getDocument().getLength();
                Element root = editor.getDocument().getDefaultRootElement();
                String text = "1" + System.getProperty("line.separator");
                for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
                    text += i + System.getProperty("line.separator");
                }
                return text;
            }
            @Override
            public void changedUpdate(DocumentEvent de) {
                lineNumbers.setText(getText());
            }

            @Override
            public void insertUpdate(DocumentEvent de) {
                lineNumbers.setText(getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                lineNumbers.setText(getText());
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Baraco IDE");

        BaracoIDE baracoIDE = new BaracoIDE();
        baracoIDE.init();
        frame.setMinimumSize(new Dimension(1200, 800));
        frame.setContentPane(baracoIDE.panelRoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        //frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void init() {
        ImageIcon playIcon = new ImageIcon("resources/play_icon.png");
        buttonRun.setIcon(playIcon);

        buttonFile.setBorder(null);
        buttonEdit.setBorder(null);

        editor.setTabSize(2);
    }
}
