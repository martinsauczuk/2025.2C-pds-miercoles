package integradorUbert;



public interface PlataformaDeViajes {

    /**
     * Solicitar un viaje para el pasajero.
     * Se debe generar un viaje en estado PENDIENTE
     * sin conductor asignado.
     * @param unPasajero
     * @param km
     */
    public void pedirViajePara(Pasajero unPasajero, int km) throws PlataformaViajesException;


    /**
     * Tomar el viajer con id por el conductor.
     * Una vez tomado el viaje, el mismo debe pasar a estado INICIADO
     * @param conductor
     * @param idViaje
     * @throws PlataformaViajesException
     */
    public void tomarViajeConId(Conductor conductor, String idViaje) throws PlataformaViajesException;



    /**
     * Finalilzar viaje, cambiar estado a FINALIZADO
     * @param idViaje
     * @throws PlataformaViajesException
     */
    public void finalizarViaje(String idViaje) throws PlataformaViajesException;


}
