
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import calculator.ComputerListener;

public class Win extends JFrame {
    JTextField jTextField;
    JTextArea jTextArea;
    JButton jButton[] = new JButton[20];
    JLabel jLabel;
    ComputerListener computerListener;

    public Win() {
        init();
        setTitle("Calculadora");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        String[] strings = { "7", "8", "9", "/", "C", "4", "5", "6", "*", "Sqrt", "1", "2", "3", "-", "1/X", "+/-", "0",
                ".", "+", "=" };
        for (int i = 0; i < jButton.length; i++) {
            jButton[i] = new JButton(strings[i]);
            // this.add(jButton[i]);
        }

        jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jTextField = new JTextField();
        jLabel = new JLabel();
        GridBagConstraints s = new GridBagConstraints();// Definir GridBagConstraints,
        s.fill = GridBagConstraints.BOTH;
        s.gridwidth = 1;
        s.gridheight = 6;
        s.weightx = 0;
        s.weighty = 0;
        s.insets = new Insets(5, 5, 2, 2);
        s.ipadx = 200;
        s.ipady = 10;
        // jTextArea.setSize();
        layout.setConstraints(jScrollPane, s);
        this.add(jScrollPane);
        s.ipadx = 10;
        s.ipadx = 10;
        // this.add(jTextArea);
        s.gridwidth = 5;
        s.gridheight = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(jTextField, s);
        this.add(jTextField);
        JPanel jPanel1 = new JPanel();
        s.gridwidth = 0;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(jPanel1, s);
        this.add(jPanel1);
        for (int i = 1; i < jButton.length + 1; i++) {
            if (i % 5 == 0) {
                s.gridwidth = 1;
                s.weightx = 0;
                s.weighty = 0;
                layout.setConstraints(jButton[i - 1], s);
                this.add(jButton[i - 1]);
                jPanel1 = new JPanel();
                s.gridwidth = 0;
                s.weightx = 0;
                s.weighty = 0;
                layout.setConstraints(jPanel1, s);
                this.add(jPanel1);
            } else {
                s.gridwidth = 1;
                s.weightx = 0;
                s.weighty = 0;
                layout.setConstraints(jButton[i - 1], s);
                this.add(jButton[i - 1]);
            }

        }

    }

    void setComputerListener(ComputerListener computerListener) {
        this.computerListener = computerListener;
        computerListener.setJTextArea(jTextArea);
        computerListener.setJTextField(jTextField);
        for (int i = 0; i < jButton.length; i++) {
            computerListener.setJBTextbotton(jButton);
            jButton[i].addActionListener(computerListener);
        }

    }

}
