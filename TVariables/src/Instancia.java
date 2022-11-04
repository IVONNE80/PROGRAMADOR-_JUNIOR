public class Instancia {
    // variables de instancia
    private float base;
    private float altura;
    private float area;
    private float perimetro;
    public String nombre;
    public String tipo;

    // constructor, todos los argumentos son variables locales
    public Instancia(float base, float altura, String nombre) {
        // this. desimismo o variable de instancia
        this.base = base; // base es variable local
        this.altura = altura;
        this.nombre = base == altura ? "cuadrado" : nombre;
        perimetro();
        area();
    }

    private void area() {
        this.area = this.base * this.altura;
    }

    /**
     * @param jfkf
     */
    private void perimetro() {
        this.perimetro = 2 * this.altura + 2 * this.base;
    }

    // sobre escribimos el método toString()
    @Override
    public String toString() {
        return "nombre: " + this.nombre + "\n" +
                "base: " + this.base + "\n" +
                "altura: " + this.altura + "\n" +
                "area: " + this.area + "\n" +
                "perimetro: " + this.perimetro + "\n" +
                "tipo: " + this.tipo + "\n";
    }

    public static void main(String[] args) {
        Instancia i1 = new Instancia(5, 5, "triangulo");
        Instancia i2 = new Instancia(8, 5, "rectangulo");
        System.out.println(i1.toString());
        System.out.println(i2.toString());
    }
}
