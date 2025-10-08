package solid.LSP.autos.original;

public class Main {

    public static void main(String[] args) {

        //
        Automovil unAuto = new Automovil();
        unAuto.cargarNafta(34);
        System.out.printf("Cantidad actual de nafta: %d %n", unAuto.cuantosLitrosTeQuedan());


        // Sustituimos una instancia de Automovil por una instancia de AutoElectrico
        unAuto = new AutoElectrico();
        unAuto.cargarNafta(34);
        System.out.printf("Cantidad actual de nafta: %d %n", unAuto.cuantosLitrosTeQuedan());



    }
}
