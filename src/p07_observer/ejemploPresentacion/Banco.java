package p07_observer.ejemploPresentacion;

public class Banco {

    // Atributos de Banco
    private float precioUsd;


    public void subeElDolar() {
        precioUsd = precioUsd + 15f;
    }

    public float cotizacionUsdArs() {
        return precioUsd;
    }


    // Otros metodos existentes de Banco



}
