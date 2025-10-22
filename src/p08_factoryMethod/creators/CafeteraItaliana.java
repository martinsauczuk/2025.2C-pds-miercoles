package p08_factoryMethod.creators;

import p08_factoryMethod.productos.Cafe;
import p08_factoryMethod.productos.CafeDeFiltro;

public class CafeteraItaliana implements CafeCreator{

    @Override
    public Cafe preparar() {
        return new CafeDeFiltro();
    }
}
