package Practica6;

public class numeros {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        numeros[0] = 12;
        numeros[1] = 10;
        numeros[2] = 4;
        numeros[3] = 24;
        numeros[4] = 5;
        numeros[5] = 9;
        for (int i = 0; i < 7; i++) {
            System.out.println("El arreglo en la posicion " + i + " tiene el numero " + numeros[i]);
        }

    }
}
