package p09_abstractFactory.bebidas;

public class PintaDeCerveza implements Bebida {

    @Override
    public boolean tieneAlcohol() {
        return true;
    }

    @Override
    public int medidaEnCm3() {
        return 500;
    }
}
