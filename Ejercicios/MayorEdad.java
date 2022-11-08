import java.util.Scanner;

class MayorEdad {

    public static void main(String[] argumentos) {
        Scanner scaner = new Scanner(System.in);
        int edad;
        System.out.println("Dime tu edad: ");
        edad = scaner.nextInt();

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}