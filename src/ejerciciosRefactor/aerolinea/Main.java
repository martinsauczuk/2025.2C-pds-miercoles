package ejerciciosRefactor.aerolinea;


public class Main {

    public static void main(String[] args) {

        Pasajero unPasajero = new Pasajero("Martin", 38);
        TicketAereo ticketBUEaBRC = new TicketAereo("BUE", "BRC",unPasajero);


        System.out.printf("Origen: %s. Destino: %s Precio: %d", ticketBUEaBRC.getOrigen(), ticketBUEaBRC.getDestino(), ticketBUEaBRC.getPrecio());

    }


}