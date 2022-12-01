
public class Ordenamiento {
    public static void burbuja(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;

                }

            }

        }

    }

    public static void insercion(int array[]) {
        for (int i = 1; i <= array.length - 1; i++) {
            int Key = i;
            int ant = i - 1;
            while ((ant >= 0) && (array[Key] < array[ant])) {
                int aux = array[Key];
                array[Key] = array[ant];
                array[ant] = aux;
                Key = ant;
                ant--;
            }
        }

    }

    public static void quickSort(int array[], int izq, int der) {
        int pivote = array[izq];
        int i = izq;
        int j = der;
        int aux;
        while (i < j) {
            while (array[i] <= pivote && i < j)
                i++;
            while (array[j] > pivote)
                j--;
            {
                if (i < j) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
            array[izq] = array[j];
            array[j] = pivote;
            if (izq < j - 1) {
                quickSort(array, izq, der);
            }
            if (j + 1 < der) {
                quickSort(array, izq, der);

            }
        }

    }
}
