package p08_factoryMethod.creators;

import p08_factoryMethod.productos.Cafe;
import p08_factoryMethod.productos.CafeViajero;

public class CafeteraVending implements CafeCreator{

//    private crearPackaging() {
//        ///
//    }

    @Override
    public Cafe preparar() {

        CafeViajero cafeViajero = new CafeViajero();

//        cafeViajero.agregarPackaging();

        return cafeViajero;
    }
}
