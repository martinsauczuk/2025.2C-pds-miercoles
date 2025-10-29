package p09_abstractFactory.factories;

import p09_abstractFactory.bebidas.Bebida;
import p09_abstractFactory.plato.Plato;

// crear una bebida y un plato
public interface MenuFactory {

    Plato cocinarPlato();

    Bebida prepararBebida();

}
