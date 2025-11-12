package segundoParcial.compras;


import segundoParcial.Participante;

public final class Vuelo implements Compra {

    private final int distanciaEnMillas;

    public Vuelo(int distanciaEnMillas) {
        this.distanciaEnMillas = distanciaEnMillas;
    }

    @Override
    public int millasQueOtorgaPara(Participante unParticipante) {
        return unParticipante.cantidadDeMillasTotales() > 1000
                ? distanciaEnMillas
                : 50;
    }
}
