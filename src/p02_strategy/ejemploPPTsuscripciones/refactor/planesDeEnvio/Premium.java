package p02_strategy.ejemploPPTsuscripciones.refactor.planesDeEnvio;

import p02_strategy.ejemploPPTsuscripciones.refactor.producto.Producto;

public class Premium implements PlanDeEnvio{

    @Override
    public int costoDeEnvioPara(Producto unProducto) {
        return 0;
    }
}
