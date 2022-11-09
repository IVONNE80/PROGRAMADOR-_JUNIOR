package condicionales;

import java.util.Scanner;

public class Condicionales {
    private static Scanner sc = new Scanner(System.in);
    
    public Condicionales(String nombre) {
        // Variables de instancias
        //!constructor es el metodo se ejecutara al crear un objeto.
        System.out.println("Hola " + nombre + " desde el constructor de Condiconales");
            // inicializar variables
    }
        /* 
        *Ejercicio1
        Escribir un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
        */
        // privicidad, Tipo de retorno, nombre de la funcion o metodo
        public String elsaludo() {
            //entreda,
            int edad = sc.nextInt();
            sc.close();
            // verificar si es mayor de edad
            if(edad>=18){//edad>17
            return "Eres mayor de Edad";
            } else{
                return "Eres menor de edad";
            }
            
        }
    }
/**
 * @return Stirng: si es validad o no la contraseña
 */
public String e2Contrasenia(String passBD){
    System.out.println(passBD);
}