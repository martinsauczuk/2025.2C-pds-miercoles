package p02_strategy.ejemploPPTsuscripciones.refactor.planesDeEnvio;

import p02_strategy.ejemploPPTsuscripciones.refactor.producto.Producto;

public interface PlanDeEnvio {

    public int costoDeEnvioPara(Producto unProducto);

}
