package models;

public class RecibeMascotas {

    String perro;

    String edad;

    String raza;

    String tamano;

    String dueno;

    public RecibeMascotas(String perro, String edad, String raza, String tamano, String dueno) {
        this.perro = perro;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
        this.dueno = dueno;
    }

    public String getPerro() {
        return perro;
    }

    public String getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getTamano() {
        return tamano;
    }

    public String getDueno() {
        return dueno;
    }

    public String toString() {
        return "perro: " + this.perro + "\n" + "edad: " + this.edad + "\n" + "raza: "
                + this.tamano + "\n" + "dueno:" + this.dueno + "\n";
    }
}
