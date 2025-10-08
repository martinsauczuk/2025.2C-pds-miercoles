package solid.SRP.empleados.original;

import java.util.HashSet;

public class Empleado {

    private int salarioBasico;
    private int diasDisponiblesVacaciones = 14;
    private int diasRestantesPorEstudio = 20;

    private String nombre;
    private String apellido;

    private HashSet<Proyecto> proyectosAsignados;


    public float calcularSueldoTotal() {
        return salarioBasico - this.descuentos();
    }

    private float descuentos() {
        return salarioBasico * 0.17f;
    }

    private void asignarProyecto(Proyecto unProyecto) {
        this.proyectosAsignados.add(unProyecto);
    }

}
