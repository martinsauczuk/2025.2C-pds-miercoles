package p03_builder.universidad.notificaciones;


public interface Observable {

    void agregarObservador(Observador observer);

    void eliminarObservador(Observador observer);

    void notificar();
}
