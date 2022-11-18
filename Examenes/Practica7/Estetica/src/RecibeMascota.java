public class RecibeMascota {

    private String perro;
    private int edad;
    private String raza;
    private String tamano;
    private String dueno;

    public RecibeMascota(String perro, int edad, String raza, String tamano, String dueno) {
        this.perro = perro;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
        this.dueno = dueno;
    }

    public String getPerro() {
        return perro;
    }

    public void setPerro(String perro) {
        this.perro = perro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "RecibeMascota [perro=" + perro + ", edad=" + edad + ", raza=" + raza + ", tamano=" + tamano + ", dueno="
                + dueno + "]";
    }

}
