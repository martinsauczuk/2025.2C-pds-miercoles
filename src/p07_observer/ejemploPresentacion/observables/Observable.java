package p07_observer.ejemploPresentacion.observables;

import p07_observer.ejemploPresentacion.observadores.Observador;

public interface Observable {

    void agregarObservador(Observador observer);

    void eliminarObservador(Observador observer);

    void notificar();

}
