package integradorUbert.observer;

public class SolicitudaDeExistenciaDeViaje implements Solicitud{

    private final String idViaje;

    private final int km;


    public SolicitudaDeExistenciaDeViaje(String idViaje, int km) {
        this.idViaje = idViaje;
        this.km = km;
    }

    @Override
    public int getDistancia() {
        return km;
    }

    @Override
    public String getIdViaje() {
        return idViaje;
    }
}
