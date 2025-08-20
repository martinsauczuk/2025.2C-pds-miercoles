package p02_strategy.ejemploPPTsuscripciones;
/*
    La suscripcion Basica tiene envío gratis para productos de $100.000 o más.
    Envío con precio fijo de $6.000 para el resto de los productos.
 */
public class SuscripcionBasica {

    private static int MINIMO_ENVIO_GRATIS = 100000;
    private static int PRECIO_ENVIO = 6000;
    private String username;

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
