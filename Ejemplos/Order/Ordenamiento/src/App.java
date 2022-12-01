import java.util.Arrays;

public class App {
    static int lista[] = { 900, 400, 600, 700, 800,200,1000,100 };

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(lista));
        Ordenamiento.quicksort(lista,0,lista.length-1);
        System.out.println(Arrays.toString(lista));
    }
}
