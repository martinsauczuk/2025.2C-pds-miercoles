package integradorUbert.plataforma;

import integradorUbert.conductores.Conductor;
import integradorUbert.observer.Observable;
import integradorUbert.observer.Observer;
import integradorUbert.observer.Solicitud;
import integradorUbert.observer.SolicitudaDeExistenciaDeViaje;
import integradorUbert.pasajeros.Pasajero;
import integradorUbert.viaje.Viaje;
import integradorUbert.viaje.ViajeImpl;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Ubert implements PlataformaDeViajes, Observable {

    private Set<Viaje> viajes = new HashSet<>();
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void pedirViajePara(Pasajero unPasajero, int km) throws PlataformaViajesException {

        // Generar un viaje
        String id = UUID.randomUUID().toString();
//        String id = unPasajero.getNombre() + km + System.currentTimeMillis();

        Viaje nuevoViaje = new ViajeImpl(id, unPasajero, km);

        // Agregar el viaje a la coleccion de viajes
        viajes.add(nuevoViaje);

        // Notificar a los observadores
        notificar(
                    new SolicitudaDeExistenciaDeViaje(nuevoViaje.getId(), nuevoViaje.getDistancia()
                )
        );

    }

    private String generarIdParaViaje() {
        // TODO: Generador de id
        return "ID";
    }

    @Override
    public void tomarViajeConId(Conductor conductor, String idViaje) throws PlataformaViajesException {
        // TODO: Buscar un viaje con el id
        Viaje viajeEncontrado = obtenerViajePorId(idViaje);

        // TODO: Validar si esta PENDIENTE
//        if.. t
//        throw new PlataformaViajesException("ya fue tomado el viaje...");

        // TODO: Asignar el conductor al viaje
//        viajeEncontrado.asignarConductor(conductor);

        // TODO: Cambiar el estado a INICIADO

    }

    @Override
    public void finalizarViaje(String idViaje) throws PlataformaViajesException {

    }

    private Viaje obtenerViajePorId(String id) throws PlataformaViajesException {
        return viajes
                .stream()
                .filter( viaje -> viaje.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new PlataformaViajesException("No existe viaje con ese Id"));
    }

    @Override
    public void agregarObservador(Observer observer) {

    }

    @Override
    public void eliminarObservador(Observer observer) {

    }

    @Override
    public void notificar(Solicitud solicitud) {
        for (Observer observer : observers) {
            observer.update(solicitud);
        }
    }
}
