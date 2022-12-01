
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

    public static void quicksort(int array[], int izq, int der) {
        int pivote = array[izq];
        int i = izq;
        int d = der;
        int aux;
        while (i < d) {
            while (array[i] <= pivote && i < d){
                i++;
            }
            while (array[d] > pivote){
                d--;
            }
            if (i < d) {
                aux = array[i];
                array[i] = array[d];
                array[d] = aux;
            }
        }
        array[izq] = array[d];
        array[d] = pivote;
        if (izq < d - 1) {
            quicksort(array, izq, d-1);
        }
        if (d + 1 < der) {
            quicksort(array, d+1, der);
        }
        

    }
}
