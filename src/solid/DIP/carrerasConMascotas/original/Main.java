package solid.DIP.carrerasConMascotas.original;

public class Main {

    public static void main(String[] args) {

        Perro apolo = new Perro(7, "Apolo");
        CorredorConPerro bautista = new CorredorConPerro("Bautista", apolo);


        DogRun laCarrera = new DogRun();
        laCarrera.incribir(bautista);

        System.out.println(laCarrera.nombresDeTodosLosPerros());


    }
}
