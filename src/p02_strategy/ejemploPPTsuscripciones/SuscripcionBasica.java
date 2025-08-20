package p02_strategy.ejemploPPTsuscripciones;

import p02_strategy.ejemploPPTsuscripciones.refactor.producto.Producto;

/*
    La suscripcion Basica tiene envío gratis para productos de $100.000 o más.
    Envío con precio fijo de $6.000 para el resto de los productos.
 */
public class SuscripcionBasica {

    private static int MINIMO_ENVIO_GRATIS = 100000;
    private static int PRECIO_ENVIO = 6000;
    private final String username;

    public SuscripcionBasica(String unUsername) {
        this.username = unUsername;
    }

    public String nombreDeUsuario() {
        return username;
    }

    public int costoDeEnvioPara(Producto unProducto) {
        return unProducto.getPrecio() >= MINIMO_ENVIO_GRATIS
                ? 0
                : PRECIO_ENVIO;
    }

}
