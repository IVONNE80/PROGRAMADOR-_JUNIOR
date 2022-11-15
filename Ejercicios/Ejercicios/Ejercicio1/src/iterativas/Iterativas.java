package iterativas;

import java.util.Scanner;

public class Iterativas {
    private static Scanner sc = new Scanner(System.in);

    public Iterativas(String nombre) {
        System.out.println("Hola" + nombre + " desde el constructor" + nombre);
    }

    /**
     * Ejercicio 2
     * Calcular la suma de los n primeros números.
     * 
     * @return
     */
    public int e2() {
        System.out.print("Ingresa un numero:");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

}
