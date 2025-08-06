package membresiasGimnasios1;

public class Actividad {

    private String descripcion;
    private String nombre;

    private TipoDeActividad tipo;


    public Actividad(String descripcion, String nombre, TipoDeActividad tipo) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public TipoDeActividad getTipo() {
        return tipo;
    }
}
