package poopMarket.cupones;

import poopMarket.cupones.estrategiasDeDescuento.EstategiaDescuento;
import poopMarket.productos.Producto;

public class CuponImpl implements Cupon {

    private EstategiaDescuento estrategiaDescuento;

    CuponImpl(EstategiaDescuento estrategiaDescuento) {
        this.estrategiaDescuento = estrategiaDescuento;
    }


    @Override
    public float descuentoPara(Producto unProducto) {
        return estrategiaDescuento.descuentoPara(unProducto);
    }

    @Override
    public String id() {
        return "234123";
    }
}
