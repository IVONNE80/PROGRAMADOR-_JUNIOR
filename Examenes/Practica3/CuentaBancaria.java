public class CuentaBancaria {

    /**
     *
     */
    private static final String LE_DI_A_CADA_AMIGO_CANTIDAD_PARA_CADA_AMIGO = "Le di a cada amigo<cantidadParaCadaAmigo>";

    public static void main(String[] args) {

        double saldo = 1000.75;
        double cantidadARetirar = 250;
        double saldoActualizado;
        saldoActualizado = saldo - cantidadARetirar;
        double cantPCA = saldoActualizado / 3;
        boolean puedeComprarT = cantPCA >= 250 ? true : false;
        System.out.println(puedeComprarT);
        System.out.println(LE_DI_A_CADA_AMIGO_CANTIDAD_PARA_CADA_AMIGO + cantPCA);

    }
}
