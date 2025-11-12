package segundoParcial;

import segundoParcial.compras.Compra;

import java.util.HashSet;

public class Persona implements Participante{

    private int cantidadDeMillas;
    private final HashSet<Compra> compras = new HashSet<>();

    public Persona(int cantidadDeMillas) {
        this.cantidadDeMillas = cantidadDeMillas;
    }

    @Override
    public int cantidadDeMillasTotales() {
        return cantidadDeMillas;
    }

    @Override
    public void cargarCompra(Compra unaCompra) {
        if (compras.add(unaCompra)) {
            computarMillas(unaCompra);
        }
    }

    private void computarMillas(Compra unaCompra) {
        cantidadDeMillas = cantidadDeMillas + unaCompra.millasQueOtorgaPara(this);
    }

    public HashSet<Compra> getCompras() {
        return compras;
    }

}
