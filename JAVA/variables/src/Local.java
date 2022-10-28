public class Local {
    public static void main(String[] args) {
        /* Variables locales */
        // Declaramos la variable
        String h;
        // inicializamos la variable
        h = "Variables locales";
        System.out.println(h);

        // Instanciar objeto de tipo local

        Local v1 = new Local();
        // Objeto v1 y el metodo saludo ()
        String f = "bony";
        Integer u = 10;
        String neme = v1.mayusculas(f);
        System.out.println("NOMBRE: " + neme);
    }

    public void saludo(String nombre) {// nombre
        // el objeto nombre y metodo length()
        System.out.println(nombre.length());
    }

    public String mayusculas(String nombre) {
        return nombre.toUpperCase();
    }
}
