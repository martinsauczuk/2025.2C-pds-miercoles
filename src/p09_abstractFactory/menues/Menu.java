package p09_abstractFactory.menues;

import p09_abstractFactory.bebidas.Bebida;
import p09_abstractFactory.plato.Plato;

public interface Menu {

    void agregarPlato(Plato unPlato);

    void agregarBebida(Bebida unaBebida);

    Plato obtenerPlato();

    Bebida obtenerBebida();

    public int precioTotal();

}
