public class Insercion {
    public static void main(String[] args) {

        int[] arreglo = { 50, 20, 40, 80, 30 };
        System.out.println("Imprimiendo arreglo antes de ordenar...");
        for (int i : arreglo) {
            System.out.printf("%d, ", i);
        }
        ordenarPorSeleccion(arreglo);

        System.out.println("\nImprimiendo arreglo después de ordenar...");
        for (int i : arreglo) {
            System.out.printf("%d, ", i);
        }
    }

    public static void ordenarPorSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {

                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }
}
