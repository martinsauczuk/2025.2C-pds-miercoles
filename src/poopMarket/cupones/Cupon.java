package poopMarket.cupones;

import poopMarket.productos.Producto;

public interface Cupon {

    float descuentoPara(Producto unProducto);

    String id();


}
