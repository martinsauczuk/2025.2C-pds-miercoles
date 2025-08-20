package p02_strategy.ejemploPPTsuscripciones;

/*
    La suscripción premium tiene envíos ilimitados en
    todos los productos
 */
public class SuscripcionPremium {

    private String username;

    public SuscripcionPremium(String username) {
        this.username = username;
    }

    public String nombreDeUsuario() {
        return username;
    }

    public int costoDeEnvioPara(Producto unProducto) {
        return 0;
    }

}
