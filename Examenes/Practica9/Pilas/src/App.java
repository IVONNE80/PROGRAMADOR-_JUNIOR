import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> camisas = new Stack<>();
        camisas.push("Camisa Blanca");
        camisas.push("Camisa Nueva");
        camisas.push("Camisa Favorita");

        System.out.println("La ultima camisa agregada es: " + camisas.peek());

        while (!camisas.empty()) {

            System.out.println(camisas.pop());
        }

    }
}
