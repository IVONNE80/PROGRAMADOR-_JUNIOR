package blucles;

public class Para {
    public static void main(String[] args) {
        // metodos
    }

    public static void para() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i =  " + i);
        }
    }

    public static void paraCada() {
        String lista[] = { "uno", "dos", "tres", "cuatro", "cinco" };
        for (String x : lista) {
            System.out.println("x =  " + x);
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println("lista[" + i + "] =  " + lista[i]);
        }
    }

    public static void paraInfinito() {
        for (int i = 0; i >= 0; i++) {
            System.out.println("For infinito" + i);
        }

        for (;;) {
            System.out.println("Otro For infinito");
        }
    }
}
