import database.Database;
import models.Mascota;
import models.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        /*Mascota[] mascotas = Utils.crearMascotas(Database.bd());
        Utils.imprimeMascota(mascotas);
        Utils u = new Utils();
        System.out.println(u);*/

        Mascota a = new Mascota("firus", "perro", "guau guau");
        System.out.println(a);
    }
}
