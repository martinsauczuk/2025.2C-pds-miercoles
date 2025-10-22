package p09_abstractFactory.bebidas;

public class Limonada implements Bebida {
    @Override
    public boolean tieneAlcohol() {
        return false;
    }

    @Override
    public int medidaEnCm3() {
        return 500;
    }
}
