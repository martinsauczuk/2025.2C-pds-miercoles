package solid.DIP.carrerasConMascotas.original;

public class CorredorConPerro {

    private final Perro perro;
    private final String nombre;

    public CorredorConPerro(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }

    public Perro tuPerro() {
        return perro;
    }

}
