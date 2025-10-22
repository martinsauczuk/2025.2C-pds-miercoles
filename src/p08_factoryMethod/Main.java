package p08_factoryMethod;


import p08_factoryMethod.creators.CafeCreator;
import p08_factoryMethod.creators.CafeteraNespresso;
import p08_factoryMethod.creators.CafeteraVending;
import p08_factoryMethod.productos.Cafe;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        CafeCreator nespresso = new CafeteraNespresso();
        CafeCreator vending = new CafeteraVending();

        // "Productos"
        HashSet<Cafe> cafesConsumidos = new HashSet<>();
        cafesConsumidos.add( nespresso.preparar() );
        cafesConsumidos.add( vending.preparar() );


        // Calcular cafe consumido en cm3
        int cafeConsumidoTotal = cafesConsumidos
                .stream()
                .mapToInt(cafe -> cafe.medida())
                .sum();
        System.out.printf("Consumi %d ml de cafe %n", cafeConsumidoTotal );

        // Cafeterias visitadas
        LinkedHashSet<CafeCreator> cafetereriasVisitadas = new LinkedHashSet<CafeCreator>();
        cafetereriasVisitadas.add(nespresso);
        cafetereriasVisitadas.add(vending);

        // Tomar un cafe


    }

}
