package p02_strategy.ejemploPPTsuscripciones.refactor.planesDeEnvio;

import p02_strategy.ejemploPPTsuscripciones.refactor.producto.Producto;

public class Plus implements PlanDeEnvio{

    private static int MINIMO_ENVIO_GRATIS = 50000;
    private static int PORCENTAJE_PRECIO_PRODUCTO = 2;

    @Override
    public int costoDeEnvioPara(Producto unProducto) {
        return unProducto.getPrecio() >= MINIMO_ENVIO_GRATIS
                ? 0
                : PORCENTAJE_PRECIO_PRODUCTO * unProducto.getPrecio() / 100;
    }
}
