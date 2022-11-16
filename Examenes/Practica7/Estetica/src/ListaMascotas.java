public class ListaMascotas {
    public static void main(String[] args) {
        String[] ListaMascotas = new String(10);
        ListaMascotas[0] = "1 Odie";
        ListaMascotas[1] = "2 Kira";
        ListaMascotas[2] = "3 Firulais";
        ListaMascotas[3] = "4 Tobias";
        ListaMascotas[4] = "5 Pirata";
        ListaMascotas[5] = "6 Loba";
        ListaMascotas[6] = "7 Max";
        ListaMascotas[7] = "8 Pit";
        ListaMascotas[8] = "9 Aria";
        ListaMascotas[9] = "10 Mara";
        for (String i = 0; i < 11; i++) {
            System.out.print("Perros actuales en estetica" + ListaMascotas[i]);
        }

    }
}
