package integradorUbert.observer;

public interface Solicitud {

    /*
        Describe la distancia en km del viaje
     */
    int getDistancia();

    
    /*
        Describe el id del viaje que se encuentra disponible
        en la plataforma para poder ser tomado
     */
    String getIdViaje();

}
