package p09_abstractFactory.menues;

import p09_abstractFactory.bebidas.Bebida;
import p09_abstractFactory.plato.Plato;

public class MenuEjecutivo implements Menu {

    private Plato plato;
    private Bebida bebida;
    private final int precio;

    public MenuEjecutivo(int precio) {
        this.precio = precio;
    }

    @Override
    public void agregarPlato(Plato unPlato) {
        plato = unPlato;
    }

    @Override
    public void agregarBebida(Bebida unaBebida) {
        bebida = unaBebida;
    }

    @Override
    public Plato obtenerPlato() {
        return plato;
    }

    @Override
    public Bebida obtenerBebida() {
        return bebida;
    }

    @Override
    public int precioTotal() {
        return precio;
    }
}
