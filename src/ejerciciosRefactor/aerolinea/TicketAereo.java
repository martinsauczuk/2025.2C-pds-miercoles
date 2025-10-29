package ejerciciosRefactor.aerolinea;

public class TicketAereo {

    private Pasajero pasajero;
    private final int precio;
    private final String origen;
    private final String destino;

    public TicketAereo(String origin, String destino, Pasajero pasajero) {
        this.origen = origin;
        this.destino = destino;
        // Menores de 18 abonan la mitad
        this.precio = pasajero.getEdad() > 18 ? 400 : 200;
    }

    public int getPrecio() {
        return precio;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }
}