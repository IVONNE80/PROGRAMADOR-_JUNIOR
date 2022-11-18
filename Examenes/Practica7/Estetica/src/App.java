import java.util.ArrayList;

public class App {
public static void main(String[] args) throws Exception {
        ArrayList<RecibeMascota> listaMascotas = new ArrayList<RecibeMascota>();
        listaMascotas.add(
                new RecibeMascota(
                        "Aria",
                        5,
                        "pitbull",
                        "mediano",
                        "Antonio"));
        listaMascotas.add(
                new RecibeMascota(
                        "Pit",
                        6,
                        "labrador",
                        "grande",
                        "Claudia"));
        listaMascotas.add(
                new RecibeMascota(
                        "Kira",
                        7,
                        "cruza",
                        "mediano",
                        "Maria"));
        listaMascotas.add(
                new RecibeMascota(
                        "Chester",
                        3,
                        "chihuhua",
                        "chico",
                        "Juan"));
        listaMascotas.add(
                new RecibeMascota(
                        "Mara",
                        10,
                        "boxer",
                        "mediano",
                        "Selena"));
        listaMascotas.add(
                new RecibeMascota(
                        "Pecas",
                        15,
                        "dalmata",
                        "grande",
                        "Francisco"));
        listaMascotas.add(
                new RecibeMascota(
                        "Loba",
                        8,
                        "pastor aleman",
                        "grande",
                        "Luis"));
        listaMascotas.add(
                new RecibeMascota(
                        "Look",
                        5,
                        "belga",
                        "grande",
                        "Rebeca"));
        listaMascotas.add(
                new RecibeMascota(
                        "Pirata",
                        12,
                        "boxer",
                        "mediano",
                        "Nancy"));
        listaMascotas.add(
                new RecibeMascota(
                        "Peluchin",
                        13,
                        "cruza",
                        "mediano",
                        "Sara"));
        for(RecibeMascota m: listaMascotas){
                System.out.println(m);
        }
        System.out.print("Perros actuales en la estetica: " + listaMascotas.size());
        }
        
}

