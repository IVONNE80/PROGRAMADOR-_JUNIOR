public class Gato {
    private char p = '|';
    private char s = ' ';
    private char[][] tablero = {
            { s, p, s, p, s },
            { s, p, s, p, s },
            { s, p, s, p, s }

    };

    public void imprimeTablero() {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int col = 0; col < tablero[fila].length; col++) {
                System.out.print(tablero[fila][col]);
                System.out.print(col != 2 ? '|' : "\n");
            }
            System.out.print(fila != 2 ? "\n-----\n" : "\n");
        }
    }

    public void tirar(int fila, int col, char c) {
    }
}
