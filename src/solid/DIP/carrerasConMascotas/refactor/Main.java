package solid.DIP.carrerasConMascotas.refactor;

import solid.DIP.carrerasConMascotas.refactor.corredores.CorredorConAcompaniante;
import solid.DIP.carrerasConMascotas.refactor.corredores.CorredorConPerro;
import solid.DIP.carrerasConMascotas.refactor.corredores.acompaniantes.Perro;
import solid.DIP.carrerasConMascotas.refactor.corredores.acompaniantes.PerroMestizoAdoptado;

public class Main {

    public static void main(String[] args) {

        Perro lola = new Perro(12, "Lola");
        CorredorConPerro megan = new CorredorConPerro("Megan", lola);

        Perro milanga = new Perro(2,"Milanga");
        CorredorConPerro lucas = new CorredorConPerro("Lucas", milanga);

        Perro perroDeRaza = new Perro(12, "Raza");
        PerroMestizoAdoptado amy = new PerroMestizoAdoptado(4,"Amy");
        CorredorConAcompaniante tobias = new CorredorConPerro("Tobias", amy);

        Carrera dogRun = new Carrera();
        dogRun.incribir(megan);
        dogRun.incribir(lucas);

        System.out.println( dogRun.nombreDeTodosLosAcompaniantes() );

    }

}
