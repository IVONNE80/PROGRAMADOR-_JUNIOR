package models;

public class Utils {
    public static RecibeMascotas[] crearMascotas(String[][] mascotasDB) {
        RecibeMascotas[] mascotas = new RecibeMascotas[mascotasDB.length];
        for (int i = 0; i < mascotas.length; i++) {
            mascotas[i] = new RecibeMascotas(mascotasDB[i][0], mascotasDB[i][1],
                    mascotasDB[i][2], mascotasDB[i][3], mascotasDB[i][4]);
        }
        return mascotas;
    }

    public static void imprimeMascota(RecibeMascotas[] recibeMascotas){
        for (RecibeMascotas m : recibeMascotas) {
            System.out.println("==============");
            System.out.println(m.toString());
}
