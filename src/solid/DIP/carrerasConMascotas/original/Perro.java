package solid.DIP.carrerasConMascotas.original;

public class Perro {

    public final int edad;
    public final String nombre;

    public Perro(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
