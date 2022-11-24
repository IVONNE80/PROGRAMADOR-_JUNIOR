import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> usuarios = new LinkedList<String>();
        usuarios.add("Benjamin");
        usuarios.add("Abraham");
        usuarios.add("Romina");
        usuarios.add("Hector");
        usuarios.add("Ivonne");

        System.out.println(usuarios);
        while (!usuarios.isEmpty()) {
            System.out.println("El nombre a eliminar es: " + usuarios.remove());

        }
    }
}
