package p03_builder.universidad;

public class Alumno {

    private final String nombre;
    private final String apellido;
    private final String dni;
    private final String legajo;

    private String genero;
    private String nacionalidad;

    public Alumno(String nombre, String apellido, String dni, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
