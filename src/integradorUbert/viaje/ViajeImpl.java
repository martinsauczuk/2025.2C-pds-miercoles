package integradorUbert.viaje;

import integradorUbert.conductores.Conductor;
import integradorUbert.pasajeros.Pasajero;

public class ViajeImpl implements Viaje{

    private final String id;
    private Conductor conductor;
    private final Pasajero pasajero;
    private final int distancia;
    private EstadoDeViaje estadoDeViaje;

    public ViajeImpl(String id, Pasajero pasajero, int distancia) {
        this.id = id;
        this.pasajero = pasajero;
        this.distancia = distancia;
        this.estadoDeViaje = EstadoDeViaje.PENDIENTE;
    }


    @Override
    public void asignarConductor(Conductor unConductor) {
        conductor = unConductor;
        estadoDeViaje = EstadoDeViaje.INICIADO;
    }

    @Override
    public void finalizarViaje() {

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getDistancia() {
        return 0;
    }

    @Override
    public EstadoDeViaje estadoDeViaje() {
        return null;
    }
}
