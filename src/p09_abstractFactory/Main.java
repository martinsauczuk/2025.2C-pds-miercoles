package p09_abstractFactory;

import p09_abstractFactory.bebidas.CopaDeVino;
import p09_abstractFactory.bebidas.PintaDeCerveza;
import p09_abstractFactory.factories.MenuFactory;
import p09_abstractFactory.factories.MenuHamburgueseriaFactory;
import p09_abstractFactory.menues.Menu;
import p09_abstractFactory.menues.MenuEjecutivo;

public class Main {

    public static void main(String[] args) {


        Menu menuEjecutivoParrilla = new MenuEjecutivo(30000);
        menuEjecutivoParrilla.agregarPlato( asadoCreator.cocinar() );
        menuEjecutivoParrilla.agregarBebida( new CopaDeVino() );

        Menu menuEjecutivoSaludable = new MenuEjecutivo(234);
        menuEjecutivoSaludable.agregarPlato( ensaladaCreator.cocinar() );
        menuEjecutivoSaludable.agregarBebida( new PintaDeCerveza() );

        MenuFactory mh = new MenuHamburgueseriaFactory();

        MenuEjecutivo menuDeHamburgueseria = new MenuEjecutivo(32343);
        menuDeHamburgueseria.agregarPlato( mh.cocinarPlato());
        menuDeHamburgueseria.agregarBebida( mh.prepararBebida());





    }


}
