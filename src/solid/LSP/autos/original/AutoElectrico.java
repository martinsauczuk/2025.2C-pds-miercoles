package solid.LSP.autos.original;

public class AutoElectrico extends Automovil {

    private int porcentajeBateria;

    public void recargarBateria() {
        porcentajeBateria = 100;
    }

    @Override
    public int cuantosLitrosTeQuedan() {
        return 0;
    }

    @Override
    public void cargarNafta(int litros) {
        // El auto electrico no necesita nafta
    }

    @Override
    public void llenarTanqueDeNafta() {
        // El auto electrico no necesita nafta
    }
}
