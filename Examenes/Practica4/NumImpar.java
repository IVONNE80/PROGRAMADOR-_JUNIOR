public class NumImpar {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            // Si el número es par
            if (i % 2 == 0)
                // saltar y continuar
                continue;
            // Si el número es impar, imprímelo
            System.out.println(i + " ");
        }
    }
}
