package p08_factoryMethod.productos;

public class CafeConPistacho implements Cafe{

    @Override
    public int medida() {
        return 0;
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
