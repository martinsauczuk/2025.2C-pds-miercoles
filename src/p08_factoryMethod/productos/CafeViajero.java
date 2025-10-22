package p08_factoryMethod.productos;

public class CafeViajero implements Cafe{

    @Override
    public int medida() {
        return 350;
    }

    @Override
    public boolean contieneCafeina() {
        return false;
    }

    @Override
    public int intensidad() {
        return 0;
    }
}
