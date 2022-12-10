package calculator;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public interface ComputerListener extends ActionListener {
    public void setJTextArea(JTextArea jTextArea);

    public void setJTextField(JTextField jTextField);

    public void setJBTextbotton(JButton jButton[]);

}
