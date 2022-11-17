import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int fila, col;
       Scanner sc = new Scanner(System.in);
       Gato gato = new Gato();
       gato.imprimeTablero();
       for (int i = 0;i<9;i++){
        System.out.println("Tiar fila");
        fila = sc.nextInt();
        System.out.println("Tira col");
        col = sc.nextInt();
        char f;
        gato.tirar(fila,col, f: 'x');
        gato.imprimeTablero();
       }


    }
}
