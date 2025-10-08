package solid.DIP.universidad.original;



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

    public String nombre() {
        return nombre;
    }

    public String apellido() {
        return apellido;
    }

    public String legajo() {
        return legajo;
    }

    public void actualizar(String mensaje) {
        System.out.println("Hacer algo con el mensaje");
    }
}
