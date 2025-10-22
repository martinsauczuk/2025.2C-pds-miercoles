package p08_factoryMethod;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Cafe> cafesConsumidos = new HashSet<>();


        // Calcular cafe consumido en cm3
        int cafeConsumidoTotal = cafesConsumidos
                .stream()
                .mapToInt(cafe -> cafe.medida())
                .sum();
        System.out.printf("Consumi %d ml de cafe %n", cafeConsumidoTotal );

        // Cafeterias visitadas
        LinkedHashSet<Cafe> cafetereriasVisitadas = new LinkedHashSet<Cafe>();


        // Tomar un cafe


    }

}
