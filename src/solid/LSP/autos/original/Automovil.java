package solid.LSP.autos.original;

public class Automovil {

    private int litrosDeNaftaEnTanque;

    public void llenarTanqueDeNafta() {
        litrosDeNaftaEnTanque = 45;
    }

    public int cuantosLitrosTeQuedan() {
        return litrosDeNaftaEnTanque;
    }

    public void cargarNafta(int litros) {
        litrosDeNaftaEnTanque = Integer.min(litrosDeNaftaEnTanque + litros, 45);
    }


}
