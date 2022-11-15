package condicionales;

import java.util.Scanner;

public class Condicionales {
    private static Scanner sc = new Scanner(System.in);

    public Condicionales(String nombre) {
        // Variables de instancias
        // !constructor es el metodo se ejecutara al crear un objeto.
        System.out.println("Hola " + nombre + " desde el constructor de Condiconales");
        // inicializar variables
    }

    /*
     * Ejercicio1
     * Escribir un programa que pregunte al usuario su edad y muestre por pantalla
     * si es mayor de edad o no.
     */
    // privicidad, Tipo de retorno, nombre de la funcion o metodo
    public String e1() {
        // entrada,
        int edad = sc.nextInt();
        sc.close();
        // verificar si es mayor de edad
        if (edad >= 18) {// edad>17
            return "Eres mayor de Edad";
        } else {
            return "Eres menor de edad";
        }

    }

    /**
     * Ejercicio 2
     * Escribir un programa que almacene una contraseña en una variable, pregunte al
     * usuario por la contraseña e imprima por pantalla si la contraseña introducida
     * por el usuario coincide con la guardada en la variable sin tener en cuenta
     * mayúsculas y minúsculas.
     */
    public String e2(String passBD) {
        System.out.print("Ingresa la contrasena:");
        String pass = sc.nextLine();
        return pass.equals(passBD) ? "La contrasena es correcta" : "La contrasena es incorrecta";
    }

    /**
     * Ejercicio 3
     * Escribir un programa que pida al usuario dos números y muestre por pantalla
     * su división. Si el divisor es cero el programa debe mostrar un error.
     */
    public String e3() {
        System.out.print("Ingresaal dividendo:");
        double dividendo = sc.nextDouble();
        System.out.print("Ingrese el divisor:");
        double divisor = sc.nextDouble();
        if (divisor != 0) {
            return "La division de" + dividendo + "/" + divisor + "=" + (dividendo / divisor);
        } else {
            return "Error divisor es CERO";
        }

    }

    /**
     * ejercicio 4
     * Escribir un programa que pida al usuario un número entero y muestre por
     * pantalla si es par o impar.
     * 
     * @return
     */
    public String e4() {
        System.out.print("Ingresar número: ");
        int numero = sc.nextInt();
        sc.close();
        return numero % 2 == 0 ? "par" : "impar";
    }

    /**
     * Ejercicio 5
     * Para pagar un determinado impuesto se debe ser mayor de 16 años y tener unos
     * ingresos iguales o superiores a $5000 mensuales. Escribir un programa que
     * pregunte al usuario su edad y sus ingresos mensuales y muestre por pantalla
     * si el usuario tiene que pagar o no..
     * 
     * @return
     */
    public String e5() {
        System.out.print("Ingresa edad:");
        int edad = sc.nextInt();
        System.out.print("Ingresa salario mensual");
        double salario = sc.nextDouble();
        sc.close();
        if (edad > 16 && salario >= 5000) {
            return "Tienes que pagar";
        } else {
            return "No tiene que pagar";
        }
    }

    /**
     * Ejercicio 6
     * Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al
     * sexo y el nombre. El grupo A esta formado por las mujeres con un nombre
     * anterior a la M y los hombres con un nombre posterior a la N y el grupo B por
     * el resto. Escribir un programa que pregunte al usuario su nombre y sexo, y
     * muestre por pantalla el grupo que le corresponde.
     * 
     * @return
     */
    public String e6() {
        System.out.print("Ingresa el nombre:");
        String nombre = sc.nextLine();
        System.out.print("Ingresa sexo:");
        String sexo = sc.nextLine();
        if(sexo == "M" && nombre(0)<"M")||
        (sexo == "H"&& nombre(0)>"N"){
            return "Grupo A";
        } else {
            return "Grupo B";
        }
    }

    /**
     * Ejercicio 7
     * En una determinada empresa, sus empleados son evaluados al final de cada año.
     * Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir
     * aumentando, traduciéndose en mejores beneficios. Los puntos que pueden
     * conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores
     * intermedios entre las cifras mencionadas. A continuación se muestra una tabla
     * con los niveles correspondientes a cada puntuación. La cantidad de dinero
     * conseguida en cada nivel es de $2,400 multiplicada por la puntuación del
     * nivel.
     * Nivel Puntuación
     * Inaceptable 0.0
     * Aceptable 0.4
     * Meritorio 0.6 o más
     * Escribir un programa que lea la puntuación del usuario e indique su nivel de
     * rendimiento, así como la cantidad de dinero que recibirá el usuario.
     * 
     * @return
     */
    public String e7() {

    }

}
