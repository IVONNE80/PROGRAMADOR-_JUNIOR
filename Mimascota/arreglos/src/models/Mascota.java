package models;

public class Mascota {
    private String nombre;
    private String tipo;
    private String sonido;

    public Mascota(String nombre, String tipo, String sonido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sonido = sonido;
    }

    public void hablar() {
        System.out.println(this.nombre + ": " + sonido);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSonido() {
        return sonido;
    }

    @Override
    public String toString() {
        return "nombre: " + this.nombre + "\n" + "tipo: " + this.tipo;
    }
}