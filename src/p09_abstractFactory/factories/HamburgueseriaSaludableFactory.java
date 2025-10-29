package p09_abstractFactory.factories;

import p09_abstractFactory.bebidas.Bebida;
import p09_abstractFactory.bebidas.Limonada;
import p09_abstractFactory.plato.HamburguesaCarneVacuna;
import p09_abstractFactory.plato.Plato;

public class HamburgueseriaSaludableFactory implements MenuFactory {

    @Override
    public Plato cocinarPlato() {
        return new HamburguesaCarneVacuna();
    }

    @Override
    public Bebida prepararBebida() {
        return new Limonada();
    }
}
