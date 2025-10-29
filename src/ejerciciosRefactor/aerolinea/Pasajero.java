package ejerciciosRefactor.aerolinea;

public class Pasajero {

    private final int edad;
    private final String nombre;

    public Pasajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}