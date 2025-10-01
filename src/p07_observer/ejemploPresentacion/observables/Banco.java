package p07_observer.ejemploPresentacion.observables;

import p07_observer.ejemploPresentacion.observadores.Observador;

import java.util.HashSet;

public class Banco implements Observable {

    // Atributos de Banco
    private float precioUsd;

    private HashSet<Observador> observadores = new HashSet<>();


    public void subeElDolar() {
        precioUsd = precioUsd + 150f;
        notificar();
    }

    public float cotizacionUsdArs() {
        return precioUsd;
    }

    @Override
    public void agregarObservador(Observador observer) {
        observadores.add(observer);
    }

    @Override
    public void eliminarObservador(Observador observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observador observador : observadores) {
            observador.actualizar(precioUsd);
        }
    }


    // Otros metodos existentes de Banco



}
