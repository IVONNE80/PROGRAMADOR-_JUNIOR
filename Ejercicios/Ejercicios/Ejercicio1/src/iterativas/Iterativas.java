package iterativas;

import java.util.Scanner;

public class Iterativas {
    private static Scanner pepito = new Scanner(System.in);

    public Iterativas(String nombre) {
        System.out.println("Hola" + nombre + " desde el constructor" + nombre);
    }

    public int e1Suma(){
    int suma = 0;
    for (int i = 0; i <=n; i++){
        suma+=i;
    }
    return suma;
    }
    
}
