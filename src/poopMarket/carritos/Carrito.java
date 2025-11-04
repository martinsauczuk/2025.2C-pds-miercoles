package poopMarket.carritos;

import poopMarket.cupones.Cupon;
import poopMarket.productos.Producto;

public interface Carrito {

    void agregarProducto(Producto unProducto);

    void agregarCupon(Cupon cupon);

    boolean puedeSerEnviado();

    float precioTotal();

    Producto elProductoMasCaro();
}
