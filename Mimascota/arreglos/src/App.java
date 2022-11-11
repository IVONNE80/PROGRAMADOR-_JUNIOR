import database.Database;
import models.Mascota;
import models.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Mascota[] mascotas = Utils.crearMascotas(Database.bd());
        Utils.imprimeMascota(mascotas);
    }
}
