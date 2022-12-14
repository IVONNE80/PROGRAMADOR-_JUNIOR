import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import org.w3c.dom.events.Event;

public class Ventana extends JFrame {
    Container teclado;
    JButton[] botones = new JButton[16];
    JTextField texto;
    JButton resultado;
    String pantalla;
    Calculadora c = new Calculadora();

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

    private Container crearBotones() {
        Container t = Container();
        t.setLayout( new GridLayout());
        String[] BOTONES_N = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "c", "0", ".",
            "+" };
        for(int = 0; i< BOTONES_N.length;i++){
            JButton aux = new JButton(BOTONES_N[i]);
            aux.addActionListener(this);
            botones[i]= aux;
            t.add(botones[i])
        }
        return t;
    }

    public void addActionPerformend(ActionEvent e) {
        if(e.getSource() == resultado){
            display.setTex(Double.parseDouble(c.resultadoDisplay(pantalla)));
        }
        for(int i = 0; i<botones.length;i++){
            if (e.getSource() == botones[i]) {
                System.out.println(botones[i].getText());
                pantalla+=botones[i].getText();
                display.setTex(pantalla);
            }
        }
        if(e.getSource() == botones[12]){
            pantalla = "";
            display.setTex(pantalla);
            c.reiniciar()
        }
                
        
    }

}
