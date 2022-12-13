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

    public static ContainerListener () {
        this.ContainerListener = ContainerListener;
		computerListener.setJTextArea(jTextArea);
		computerListener.setJTextField(jTextField);
		for (int i = 0; i < jButton.length; i++) {
			computerListener.setJBTextbotton(jButton);
			jButton[i].addActionListener(computerListener);
    }

    private void crearBotones() {
        //INICIALIZAMOS EL ARREGLO DE BOTONES
        boton = new JButton[20];
        //INICIALIZAMOS LOS BOTONES
        boton[0]=new JButton("Resultado");
        boton[1]=new JButton("");
        boton[2]=new JButton("");
        boton[3]=new JButton("");
        boton[4]=new JButton("7");
        boton[5]=new JButton("8");
        boton[6]=new JButton("9");
        boton[7]=new JButton("/");
        boton[8]=new JButton("4");
        boton[9]=new JButton("5");
        boton[10]=new JButton("6");
        boton[11]=new JButton("*");
        boton[12]=new JButton("1");
        boton[13]=new JButton("2");
        boton[14]=new JButton("3");
        boton[15]=new JButton("-");
        boton[16]=new JButton("0");
        boton[17]=new JButton(".");
        boton[18]=new JButton("=");
        boton[19]=new JButton("+");
        //AGREAMOS LOS BOTONES AL PANEL BOTONES
        for(int i=0;i<20;i++){
            panel_botones.add(boton[i]);
        }
        //EVENTOS DE LOS BOTONES
        //OPERACIONES
        boton[19].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1+Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="suma";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        boton[15].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1-Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="resta";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        boton[11].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1*Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="multiplicacion";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        boton[7].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1/Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="division";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        //NUMEROS Y PUNTO DECIMAL
        boton[4].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"7");
            }
        });
        boton[5].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"8");
            }
        });
        boton[6].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"9");
            }
        });
        boton[8].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"4");
            }
        });
        boton[9].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"5");
            }
        });
        boton[10].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"6");
            }
        });
        boton[12].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"1");
            }
        });
        boton[13].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"2");
            }
        });
        boton[14].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"3");
            }
        });
        boton[16].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"0");
            }
        });
        boton[17].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+".");
            }
        });
        //IGUAL
        boton[18].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    op2=Double.parseDouble(caja.getText());
                }catch(Exception err){}
                if(operacion.equals("suma")){
                    double res=op1+op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double res=op1-op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double res=op1*op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double res=op1/op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }
                nueva=true;
            }
        });
        //CE
        boton[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                caja.setText("");
                op1=op2=0;
                operacion="";
            }
        });
}