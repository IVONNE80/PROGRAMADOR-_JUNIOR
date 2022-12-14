/*
TALLER: PROGRAMADOR JUNIOR 
TEMA:CALCULADORA
PRACTICA:PROYECTO FINAL
NOMBRE:IVONNE HERNANDEZ BAUTISTA
FOLIO:15416TV14
FECHA:14/12/22 
 * 
 */
package ProyectoF;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import static java.awt.Font.PLAIN;

public class Calculadora extends JFrame {

    JLabel display;
    int numBotones = 17;
    JButton botones[] = new JButton[numBotones];
    String textoBotones[] = { "Resultado", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", ".",
            "+" };
    int xBotones[] = { 15, 15, 80, 145, 210, 15, 80, 145, 210, 15, 80, 145, 210, 15, 80, 145, 210 };
    int yBotones[] = { 90, 155, 155, 155, 155, 220, 220, 220, 220, 285, 285, 285, 285, 350, 350, 350, 350 };
    int numerosBotones[] = { 14, 9, 10, 11, 5, 6, 7, 1, 2, 3 };
    int[] operacionesBotones = { 16, 12, 8, 4 };
    int anchoBoton = 50;
    int altoBoton = 50;
    boolean nuevoNumero = true;
    boolean puntoDecimal = false;
    double operando1 = 0;
    double operando2 = 0;
    double resultado = 0;
    String operacion = "";

    public Calculadora() {

        initDisplay();
        initBotones();
        initPantalla();
        eventosNumeros();
        eventoDecimal();
        eventosOperaciones();
        eventoResultado();
        eventoLimpiar();

    }

    private void eventoLimpiar() {
        botones[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                display.setText("0");
                limpiar();
            }
        });
    }

    private void eventoResultado() {
        botones[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado();

            }
        });
    }

    private void eventosOperaciones() {
        for (int numBoton : operacionesBotones) {
            botones[numBoton].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (operacion.equals("")) {

                        operacion = textoBotones[numBoton];

                        operando2 = Double.parseDouble(display.getText());

                        nuevoNumero = true;
                        puntoDecimal = false;

                    } else {
                        operando2 = resultado();
                        operacion = textoBotones[numBoton];
                    }

                    System.out.println(operando2 + " " + operacion + " " + operando1);

                }
            });
        }

    }

    private double resultado() {

        operando1 = Double.parseDouble(display.getText());

        switch (operacion) {

            case "+":
                resultado = operando2 + operando1;
                break;
            case "-":
                resultado = operando2 - operando1;
                break;
            case "*":
                resultado = operando2 * operando1;
                break;
            case "/":
                resultado = operando2 / operando1;
                break;

        }

        Locale localeActual = Locale.GERMAN;
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(localeActual);
        simbolos.setDecimalSeparator('.');
        DecimalFormat formatoResultado = new DecimalFormat("#.######", simbolos);
        display.setText(String.valueOf(formatoResultado.format(resultado)));

        limpiar();

        return resultado;

    }

    private void limpiar() {

        operando1 = operando2 = 0;
        operacion = "";
        nuevoNumero = true;
        puntoDecimal = false;
    }

    private void eventoDecimal() {
        botones[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!puntoDecimal) {
                    display.setText(display.getText() + textoBotones[15]);
                    puntoDecimal = true;
                    nuevoNumero = false;
                }
            }
        });
    }

    private void eventosNumeros() {
        for (int i = 0; i < 10; i++) {
            int numBoton = numerosBotones[i];
            botones[numBoton].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (nuevoNumero) {
                        if (!textoBotones[numBoton].equals("0")) {
                            display.setText(textoBotones[numBoton]);
                            nuevoNumero = false;
                        }
                    }

                    else {
                        display.setText(display.getText() + textoBotones[numBoton]);
                    }
                }
            });
        }
    }

    private void initPantalla() {
        setLayout(null);
        setTitle("Calculadora");
        setSize(290, 455);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setVisible(true);
    }

    private void initBotones() {
        for (int i = 0; i < numBotones; i++) {
            botones[i] = new JButton(textoBotones[i]);
            int size = (i == 0) ? 24 : 16;
            int ancho = (i == 0) ? 245 : anchoBoton;
            botones[i].setBounds(xBotones[i], yBotones[i], ancho, altoBoton);
            botones[i].setFont(new Font("MONOSPACED", PLAIN, size));
            botones[i].setOpaque(true);
            botones[i].setFocusPainted(false);
            botones[i].setBackground(Color.DARK_GRAY);
            botones[i].setForeground(Color.WHITE);
            botones[i].setBorder(new LineBorder(Color.DARK_GRAY));
            add(botones[i]);
        }
    }

    private void initDisplay() {
        display = new JLabel("0");
        display.setBounds(15, 15, 245, 60);
        display.setOpaque(true);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.GREEN);
        display.setBorder(new LineBorder(Color.DARK_GRAY));
        display.setFont(new Font("MONOSPACED", PLAIN, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display);
    }

}
