package p07_observer.ejemploPresentacion;

public interface Observable {

    void agregarObservador(Observador observer);

    void eliminarObservador(Observador observer);

    void notificar();

}
