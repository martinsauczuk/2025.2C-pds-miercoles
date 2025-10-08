package solid.DIP.carrerasConMascotas.original;

public class Main {

    public static void main(String[] args) {

        Perro lola = new Perro(12, "Lola");
        CorredorConPerro megan = new CorredorConPerro("Megan", lola);

        Perro milanga = new Perro(2,"Milanga");
        CorredorConPerro lucas = new CorredorConPerro("Lucas", milanga);


        DogRun carrera = new DogRun();
        carrera.incribir(megan);
        carrera.incribir(lucas);

        System.out.println( carrera.nombresDeTodosLosPerros());




    }
}
