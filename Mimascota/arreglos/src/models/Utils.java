package models;

public class Utils {
    public static Mascota[] crearMascotas(String[][] mascotasDB) {
        Mascota[] mascotas = new Mascota[mascotasDB.length];

        for (int i = 0; i < mascotas.length; i++) {
            mascotas[i] = new Mascota(mascotasDB[i][0], mascotasDB[i][1], mascotasDB[i][2]);
        }
        return mascotas;
    }

    public static void imprimeMascota(Mascota[] mascota) {
        for (Mascota m : mascota) {
            System.out.println(m);
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
