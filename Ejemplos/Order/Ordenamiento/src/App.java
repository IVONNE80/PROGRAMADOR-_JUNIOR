import java.util.Arrays;

public class App {
    static int lista[] = { 900, 400, 600, 700, 800, };

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(lista));
        Ordenamiento.burbuja(lista);
        System.out.println(Arrays.toString(lista));
    }
}
