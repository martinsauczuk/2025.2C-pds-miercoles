package p07_observer.ejemploPresentacion;

import p07_observer.ejemploPresentacion.observables.Banco;
import p07_observer.ejemploPresentacion.observadores.Economista;
import p07_observer.ejemploPresentacion.observadores.ImportadorApple;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) {

        ImportadorApple importadorApple = new ImportadorApple();
        Banco bancoDolar = new Banco();
        bancoDolar.agregarObservador(importadorApple);
        System.out.println(importadorApple.precioEnArsDelUltimoIphone());

        bancoDolar.subeElDolar();
        System.out.println(importadorApple.precioEnArsDelUltimoIphone());

        Economista pedro = new Economista();
        bancoDolar.agregarObservador(pedro);


        bancoDolar.subeElDolar();

    }

}
