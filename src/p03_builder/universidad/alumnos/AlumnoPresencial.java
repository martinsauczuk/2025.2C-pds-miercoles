package p03_builder.universidad.alumnos;


import p03_builder.universidad.notificaciones.Observador;

public class AlumnoPresencial implements Alumno, Observador {

    private final String nombre;
    private final String apellido;
    private final String dni;
    private final String legajo;

    private String genero;
    private String nacionalidad;

    public AlumnoPresencial(String nombre, String apellido, String dni, String legajo) {
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

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public String apellido() {
        return apellido;
    }

    @Override
    public String legajo() {
        return legajo;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Hacer algo con el mensaje");
    }
}
