import database.Database;
import models.RecibeMascotas;
import models.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        RecibeMascotas[] mascotas = Utils.crearMascotas(Database.bd());
        Utils.imprimeMascota(mascotas);
    }
}
