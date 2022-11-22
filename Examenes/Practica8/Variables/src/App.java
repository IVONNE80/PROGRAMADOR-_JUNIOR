import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa tu nombre completo:");
        String nombre = datos.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad = datos.nextInt();

        if (edad >= 18) {
            System.out.println("Tu nombre es: " + nombre + " tienes "
                    + edad + " años y eres mayor de edad");
        } else {
            System.out.println("Tu nombre es: " + nombre + " tienes "
                    + edad + " años y eres menor de edad");
        }
        String exampleString = nombre;
        int stringLength = exampleString.length();

        System.out.println("Tu nombre tiene: " + stringLength + " caracteres");

        datos.close();

    }

}
