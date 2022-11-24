import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack camisas = new Stack<>();
        camisas.push("Camisa Blanca");
        camisas.push("Camisa Nueva");
        camisas.push("Camisa Favorita");

        System.out.println("La ultima camisa agregada es: " + camisas.peek());

        if (!camisas.empty()) {

            System.out.println(camisas.pop());
        } else {

            System.out.println("Pila vacia");
        }

    }
}
