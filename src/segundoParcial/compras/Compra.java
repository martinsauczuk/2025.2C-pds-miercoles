package segundoParcial.compras;


import segundoParcial.Participante;

public interface Compra {

    /**
     * Describe la cantidad de millas que otorga la compra para el participante del programa.
     * @param unParticipante: Participante del programa que realiza la compra
     * @return cantidad de millas en puntos.
     */
    int millasQueOtorgaPara(Participante unParticipante);

}
