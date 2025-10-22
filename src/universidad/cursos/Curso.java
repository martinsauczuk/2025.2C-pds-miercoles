package universidad.cursos;

import universidad.alumnos.Alumno;
import universidad.aulas.Aula;
import universidad.materias.Materia;

import java.util.Set;

public interface Curso {

    int cantidadMaximaDeAlumnos();

    Set<Alumno> alumnos();

    void agregarAlumno(Alumno unAlumno);

    Materia materia();

    void asignarMateria(Materia unaMateria);

    Aula aulaAsignada();

    void asignarAula(Aula unAula);

}
