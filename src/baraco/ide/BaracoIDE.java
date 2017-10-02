package baraco.ide;

import javax.swing.*;
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


    public BaracoIDE() {
        buttonRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Run clicked");
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
    }
}
