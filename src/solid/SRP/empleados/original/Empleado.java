package solid.SRP.empleados.original;

public class Empleado {

    private int salarioBasico;
    private int diasDisponiblesVacaciones = 14;
    private int diasRestantesPorEstudio = 20;

    private String nombre;
    private String apellido;


    public float calcularSueldoTotal() {
        return salarioBasico - this.descuentos();
    }

    private float descuentos() {
        return salarioBasico * 0.17f;
    }

}
