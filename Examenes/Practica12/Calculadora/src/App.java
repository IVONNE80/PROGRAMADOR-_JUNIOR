import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class App {
    public static void main(String[] args) throws Exception {
        float n1 = 0;
        float n2 = 0;
        int ope = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el primer numero");
        n1 = sc.nextFloat();
        System.out.println("Digita el segundo numero");
        n2 = sc.nextFloat();
        System.out.println(
                "Digita el numero de la operacion a realizar: 1: suma, 2: resta, 3: multiplicaico, 4: Division");
        ope = sc.nextInt();

        Operaciones oper = new Operaciones(n1, n2);
        float Result = 0;

        switch (ope) {
            case 1:
                Result = oper.suma();
                break;
            case 2:
                Result = oper.resta();
                break;
            case 3:
                Result = oper.multiplicacion();
                break;
            case 4:
                Result = oper.division();
                break;

        }
        System.out.println("El resultado de la operacion es: " + Result);

    }
}
