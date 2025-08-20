package p02_strategy.ejemploPPTsuscripciones;

import p02_strategy.ejemploPPTsuscripciones.refactor.producto.Producto;

/*
    La suscripción Plus tiene envío gratis solo para productos con
    precio mayor o igual a $50.000. Para los demás productos tiene
    un precio del 15% del precio del producto
 */
public class SuscripcionPlus {

    private static int MINIMO_ENVIO_GRATIS = 50000;
    private static int PORCENTAJE_PRECIO_PRODUCTO = 2;
    private String username;

    public SuscripcionPlus(String unUsername) {
        this.username = unUsername;
    }

    public String nombreDeUsuario() {
        return username;
    }

    public int costoDeEnvioPara(Producto unProducto) {
        return unProducto.getPrecio() >= MINIMO_ENVIO_GRATIS
                ? 0
                : PORCENTAJE_PRECIO_PRODUCTO * unProducto.getPrecio() / 100;
    }



}
