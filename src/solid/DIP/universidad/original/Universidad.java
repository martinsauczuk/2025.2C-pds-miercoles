package solid.DIP.universidad.original;

import java.util.HashSet;

public class Universidad {

    private HashSet<Alumno> alumnos = new HashSet<>();
    private HashSet<Carrera> carreras = new HashSet<>();


    void agregarAlumno(Alumno unAlumno){
        alumnos.add(unAlumno);
    }

    void agregarCarrera(Carrera unaCarrera) {
        carreras.add(unaCarrera);
    }

}
