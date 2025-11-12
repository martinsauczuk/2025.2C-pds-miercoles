package segundoParcial;

import segundoParcial.compras.Vuelo;
import segundoParcial.decorator.Multiplicador;
import segundoParcial.decorator.Sumador;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        Vuelo buenosAiresBariloche = new Vuelo(400);
        Persona martin = new Persona(10000);

        martin.cargarCompra(buenosAiresBariloche);
        System.out.printf("Cantidad total: %d %n" ,martin.cantidadDeMillasTotales());

        Multiplicador vueloX2 = new Multiplicador(buenosAiresBariloche,2);
        System.out.printf("Cantidad de millas que otorga: %d %n", vueloX2.millasQueOtorgaPara(martin));

    }
}
