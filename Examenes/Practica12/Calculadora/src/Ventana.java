import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {
    JTextField texto;
    JButton resultado;
    JButton teclado;
    GridBagConstraints gbc; 

   
    public Ventana() {
        super("Calculadora");
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        texto = new JTextField();
        resultado = new JButton("Resultado");
        teclado = new JButton("Teclado");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.g
    
    }
    
}
