import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    JTextField texto;
    JButton resultado;
    GridBagConstraints gbc;

    public Ventana() {
        super("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        texto = new JTextField();
        resultado = new JButton("Resultado");
        gbc = new GridBagConstraints();
        // elemento 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.1;
        gbc.weighty = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        add(texto, gbc);
        // elemento 2
        gbc.gridy = 1;
        add(resultado, gbc);
        // elemento 2
        gbc.gridy = 2;
        gbc.weightx = 0.8;
        gbc.weighty = 0.8;
        add(Teclado.regresaTeclado(), gbc);
    }

}
