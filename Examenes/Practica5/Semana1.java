import java.util.Scanner;

public class Semana1 {
    private static Scanner semana;

    public static <semana> void main(String[] args) {

        semana = new Scanner(System.in);

        System.out.print("Introduce un numero del 1 al 7 para conocer el dia de la semana");

        int dia = semana.nextInt();

        String NDia = "";

        switch (dia) {

            case 1:

                NDia = "Lunes";

                break;

            case 2:

                NDia = "Martes";

                break;

            case 3:

                NDia = "Miercoles";

                break;

            case 4:

                NDia = "Jueves";

                break;

            case 5:

                NDia = "Viernes";

                break;

            case 6:

                NDia = "Sabado";

                break;

            case 7:

                NDia = "Domingo";

                break;

            default:

                NDia = "Numero no valido";

                break;

        }

        System.out.println(NDia);

    }

}
