package p09_abstractFactory.bebidas;

public class CopaDeVino implements Bebida {

    @Override
    public boolean tieneAlcohol() {
        return true;
    }

    @Override
    public int medidaEnCm3() {
        return 250;
    }
}
