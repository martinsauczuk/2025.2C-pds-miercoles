package solid.DIP.carrerasConMascotas.refactor.corredores.acompaniantes;

public class Perro implements Acompaniante{

    private final int edad;
    private final String nombre;

    public Perro(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String tuNombre() {
        return this.nombre;
    }
}
