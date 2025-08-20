package p02_strategy.ejemploPPTsuscripciones.refactor;

import p02_strategy.ejemploPPTsuscripciones.refactor.producto.Producto;
import p02_strategy.ejemploPPTsuscripciones.refactor.planesDeEnvio.PlanDeEnvio;

public class Suscripcion {

    private String username;
    private PlanDeEnvio plan;

    public Suscripcion(String username, PlanDeEnvio planInicial) {
        this.username = username;
        this.plan = planInicial;
    }

    public void setPlan(PlanDeEnvio plan) {
        this.plan = plan;
    }

    // Delegar en el plan
    public int costoDeEnvioPara(Producto unProducto) {
        return plan.costoDeEnvioPara(unProducto);
    }

}
