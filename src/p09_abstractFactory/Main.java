package p09_abstractFactory;

import p09_abstractFactory.menues.Menu;
import p09_abstractFactory.menues.MenuEjecutivo;
import p09_abstractFactory.plato.PorcionDeAsado;

public class Main {

    public static void main(String[] args) {


        Menu menuEjecutivoParrilla = new MenuEjecutivo(30000);
        menuEjecutivoParrilla.agregarPlato( new PorcionDeAsado());




    }


}
