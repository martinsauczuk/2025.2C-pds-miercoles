package p08_factoryMethod.creators;

import p08_factoryMethod.productos.Cafe;
import p08_factoryMethod.productos.CafeConPistacho;

public class CafePistachoCreator implements CafeCreator{
    @Override
    public Cafe preparar() {
        return new CafeConPistacho();
    }
}
