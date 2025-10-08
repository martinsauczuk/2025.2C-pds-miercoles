package p03_builder.universidad;

import p03_builder.universidad.alumnos.Alumno;
import p03_builder.universidad.carreras.Carrera;
import p03_builder.universidad.notificaciones.Observable;
import p03_builder.universidad.notificaciones.Observador;

import java.util.HashSet;

public class Universidad implements Observable {

    private HashSet<Alumno> alumnos = new HashSet<>();
    private HashSet<Carrera> carreras = new HashSet<>();

    private HashSet<Observador> observadores = new HashSet<>();

    void agregarAlumno(Alumno unAlumno){
        alumnos.add(unAlumno);
    }

    void agregarCarrera(Carrera unaCarrera) {
        carreras.add(unaCarrera);
    }


    @Override
    public void agregarObservador(Observador observer) {

    }

    @Override
    public void eliminarObservador(Observador observer) {

    }

    @Override
    public void notificar() {

    }
}
