package p08_factoryMethod.creators;

import p08_factoryMethod.productos.Cafe;
import p08_factoryMethod.productos.CafeDeCapsula;

public class CafeteraNespresso implements CafeCreator{

    @Override
    public Cafe preparar() {
        return new CafeDeCapsula();
    }
}
