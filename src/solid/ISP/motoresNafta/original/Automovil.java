package solid.ISP.motoresNafta.original;

public class Automovil implements Vehiculo{

    private int cantidadNafta;

    @Override
    public void acelerar() {

    }

    @Override
    public void frenar() {

    }

    @Override
    public int cuantaNaftaTeQueda() {
        return cantidadNafta;
    }

    @Override
    public void cargarTanque() {

    }
}
