package solid.DIP.carrerasConMascotas.refactor.corredores;

import solid.DIP.carrerasConMascotas.refactor.corredores.acompaniantes.Acompaniante;
import solid.DIP.carrerasConMascotas.refactor.corredores.acompaniantes.Perro;

public class CorredorConPerro implements CorredorConAcompaniante {

    private final Perro perro;
    private final String nombre;

    public CorredorConPerro(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }

    public Perro tuPerro() {
        return perro;
    }

    @Override
    public Acompaniante tuAcompaniante() {
        return this.tuPerro();
    }
}
