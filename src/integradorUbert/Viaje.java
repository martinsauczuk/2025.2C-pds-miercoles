package integradorUbert;


public interface Viaje {

    /*
        Asignar un conductor al viaje
     */
    void asignarConductor(Conductor unConductor);

    /*
        Finalizar el viaje
     */
    void finalizarViaje();

    /*
        Obtener id
     */
    String getId();

    /*
        Obtener distancia del viaje
     */
    int getDistancia();


    /*
        Obtener el estado de Viaje
     */
    EstadoDeViaje estadoDeViaje();

}
