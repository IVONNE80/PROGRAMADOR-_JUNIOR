public class RecibeMascota {

    String perro;
    String edad;
    String raza;
    String tamano;
    String dueno;

    public RecibeMascota(String perro, String edad, String raza, String tamano, String dueno) {
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

    @Override
    public String toString() {
        return "RecibeMascota [perro=" + perro + ", edad=" + edad + ", raza=" + raza + ", tamano=" + tamano + ", dueno="
                + dueno + "]";
    }

}
