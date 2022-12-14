public class Operaciones {
    float n1;
    float n2;

    public Operaciones() {
        n1 = 0;
        n2 = 0;
    }

    public Operaciones(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public float suma() {
        return n1 + n2;
    }

    public float resta() {
        return n1 - n2;
    }

    public float multiplicacion() {
        return n1 * n2;
    }

    public float division() {
        if (n2 == 0) {
            return 0;
        } else {

            return n1 / n2;
        }
    }

}
