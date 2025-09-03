package p05_state.maquinaCafeVending.conState;

public class Main {

    public static void main(String[] args) {
        CafeVending cafeVending = new CafeVending();
        System.out.println(cafeVending.indicacionDisplay());
        cafeVending.btnCafeCortado();
        System.out.println(cafeVending.indicacionDisplay());

        // "Ir a siguiente" estado
        System.out.println("Acercamos la tarjeta");
        cafeVending.acercarTarjetaCredito();
        System.out.println(cafeVending);
        System.out.println( cafeVending.indicacionDisplay());

        // TODO: Terminar de implementar

    }
}
