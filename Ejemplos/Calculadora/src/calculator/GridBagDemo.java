import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GridBagDemo extends JFrame {
    public static void main(String args[]) {
        GridBagDemo demo = new GridBagDemo();
    }

    public GridBagDemo() {
        init();
        this.setSize(300, 300);
        this.setVisible(true);
    }

    JButton j1;
    JButton j2;
    JButton j3;
    JPanel j4;
    JComboBox j5;
    JTextField j6;
    JButton j7;
    JList j8;
    JTextArea j9;

    void init() {
        // GridBagConstraints gridBagConstraints = new GridBagConstraints();
        j1 = new JButton("encender");
        j2 = new JButton("salvar");
        j3 = new JButton("Guardar como");
        j4 = new JPanel();
        String[] str = { "notas de Java", "Notas de C #", "Notas HTML5" };
        j5 = new JComboBox(str);
        j6 = new JTextField();
        j7 = new JButton("Vacío");
        j8 = new JList(str);
        j9 = new JTextArea();
        j9.setBackground(Color.PINK);// Para ver el efecto, establece el color
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        this.add(j1);// agrega el componente a jframe
        this.add(j2);
        this.add(j3);
        this.add(j4);
        this.add(j5);
        this.add(j6);
        this.add(j7);
        this.add(j8);
        this.add(j9);

        GridBagConstraints s = new GridBagConstraints();// Definir GridBagConstraints,
        // se usa para controlar la posición de visualización del componente agregado
        s.fill = GridBagConstraints.BOTH;

        // Este método es para establecer la situación de visualización si el área del
        // componente es más grande que el propio componente
        // NINGUNO: No ajuste el tamaño del componente.
        // HORIZONTAL: ensancha el componente para que llene su área de visualización en
        // la dirección horizontal, pero no cambie la altura.
        // VERTICAL: realce el componente para que llene su área de visualización en la
        // dirección vertical, pero no cambie el ancho.
        // AMBOS: Haga que el componente llene completamente su área de visualización.
        s.gridwidth = 3;// Este método es para establecer el número de cuadrículas ocupadas por el nivel
                        // del componente, si es 0, significa que el componente es el último en la fila
        s.weightx = 0;// Este método establece el rango de estiramiento del nivel del componente. Si
                      // es 0, no se extenderá. Si no es 0, se extenderá a medida que aumenta la
                      // ventana, entre 0 y 1.
        s.weighty = 0;// Este método establece el rango de estiramiento vertical del componente. Si es
                      // 0, no se extenderá. Si no es 0, se extenderá a medida que aumenta la ventana,
                      // entre 0 y 1.
        layout.setConstraints(j1, s);// Configurar componentes

        s.gridwidth = 1;
        // s.insets = new Insets(5, 5, 5, 5);
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(j2, s);

        s.gridwidth = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(j3, s);

        s.gridwidth = 0;// Este método es para establecer el número de cuadrículas ocupadas por el nivel
                        // del componente, si es 0, significa que el componente es el último en la fila
        s.weightx = 0;// No puede ser 1, j4 ocupa 4 cuadrículas y se puede estirar horizontalmente,
        // Pero si es 1, la cuadrícula de la siguiente fila también se estirará, dando
        // como resultado la columna donde j7 también se estirará
        // Por lo que debería ser estirado siguiendo j6
        s.weighty = 0;
        layout.setConstraints(j4, s);
        s.gridwidth = 2;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(j5, s);
        ;
        s.gridwidth = 4;
        s.weightx = 1;
        s.weighty = 0;
        layout.setConstraints(j6, s);
        ;
        s.gridwidth = 0;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(j7, s);
        ;
        s.gridwidth = 2;
        s.weightx = 0;
        s.weighty = 1;
        layout.setConstraints(j8, s);
        ;
        s.gridwidth = 5;
        s.weightx = 0;
        s.weighty = 1;
        layout.setConstraints(j9, s);
    }
}
