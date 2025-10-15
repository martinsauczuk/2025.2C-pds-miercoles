package integradorUbert;

public interface Observable {

    /**
     *  Eliminar un observador
     */
    void agregarObservador(Observer observer);


    /**
     *  Agregar un observador
     */
    void eliminarObservador(Observer observer);



    /**
     * Notificar con una Solicitud de Viaje
     */
    void notificar(Solicitud solicitud);

}
