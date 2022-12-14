import java.util.LinkedList;
import java.util.Queue;

public class Calculadora {
    private String display;
    private Double resultado;
    private Queue<String> cola = new LinkedList<String>();

    public Calculadora() {
        display = "";
        resultado = 0.0;
    }

    private void suma(Double n) {
        resultado += n;
    }

    private void resta(Double n) {
        resultado -= n;
    }

    private void multiplicacion(Double n) {
        resultado *= n;
    }

    private void division(Double n) {
        resultado /= n;
    }

    private void pasarAcola(String pantalla) {
        cola = new LinkedList<String>();
        String aux = "";
        char elemento = ' ';
        for (int i = 0; i < pantalla.length(); i++) {
            elemento = pantalla.charAt(i);
            if(elemento != '-' && elemento != '+' && elemento != '*' && elemento != '/') {
                aux += elemento;
            } else {
                cola.add(aux);
                cola.add(Character.toString(elemento));
                aux = "";
            }           
        }
        cola.add(aux);

    }

    public Double resultadoDisplay(String pantalla) {
        pasarAcola(pantalla);
        suma(Double.parseDouble(cola.poll()));
        while (!cola.isEmpty())
            switch (cola.poll()) {
                case "+":
                    suma(Double.parseDouble(cola.poll()));
                    break;
                case "-":
                    resta(Double.parseDouble(cola.poll()));
                    break;
                case "*":
                    multiplicacion(Double.parseDouble(cola.poll()));
                    break;
                case "/":
                    division(Double.parseDouble(cola.poll()));
                    break;
                default:
                    break;

            }
        return resultado;
    }

    public void reiniciar() {
        resultado=0.0;
    }

}
