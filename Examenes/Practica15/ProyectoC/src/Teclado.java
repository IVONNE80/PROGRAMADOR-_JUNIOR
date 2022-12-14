import javax.swing.*;
import java.awt.*;

public class Teclado {
    private static final String ContainerListener = null;
    private static String[] botones = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "c", "0", ".",
            "+" };
    private static int filas, columnas, sepH, sepV;
    private static Container tecladContainer;
    private static JButton[] botonesJ = new JButton[16];

    private static void crearContenedor() {
        // contenedor
        tecladContainer = new Container();
        // definimos el grid
        filas = 4;
        columnas = 4;
        sepH = 2;
        sepV = 2;
        tecladContainer.setLayout(new GridLayout(filas, columnas, sepH, sepV));
        // creamos 16 botones, # elementos filas*columnas
        for (int i = 0; i < botones.length; i++) {
            tecladContainer.add(new JButton(botones[i]));

        }

    }

    public static Component regresaTeclado() {
        return null;
    }
}
