package p03_builder.universidad.carreras;

import p03_builder.universidad.materias.Materia;

import java.util.HashSet;

public interface Carrera {

    String nombre();

    HashSet<Materia> materias();

}
