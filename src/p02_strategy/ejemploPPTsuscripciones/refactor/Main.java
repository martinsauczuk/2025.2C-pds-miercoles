package p02_strategy.ejemploPPTsuscripciones.refactor;

import p02_strategy.ejemploPPTsuscripciones.refactor.planesDeEnvio.Basic;
import p02_strategy.ejemploPPTsuscripciones.refactor.planesDeEnvio.Plus;
import p02_strategy.ejemploPPTsuscripciones.refactor.producto.Producto;

public class Main {

    public static void main(String[] args) {

        Suscripcion suscripcionDeMartin = new Suscripcion("martin1234", new Basic());

        Producto monitorSamsung = new Producto(200000,"Monitor 24");
        Producto cableHdmi = new Producto(13000,"Cable HDMI reforzado");

        System.out.println("Suscripcion basica de Martin");
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                monitorSamsung.getPrecio(),
                suscripcionDeMartin.costoDeEnvioPara(monitorSamsung)
        );
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                cableHdmi.getPrecio(),
                suscripcionDeMartin.costoDeEnvioPara(cableHdmi)
        );
        System.out.println("---------");

        System.out.println("Suscripcion Plus de Martin");

        // Cambiamos el plan
        suscripcionDeMartin.setPlan(new Plus());

        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                monitorSamsung.getPrecio(),
                suscripcionDeMartin.costoDeEnvioPara(monitorSamsung)
        );
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                cableHdmi.getPrecio(),
                suscripcionDeMartin.costoDeEnvioPara(cableHdmi)
        );
//        System.out.println("---------");
//
//
//        System.out.println("Suscripcion Premium");
//        System.out.printf(
//                "Precio del producto: $%d, precio envio: $%d \n",
//                monitorSamsung.getPrecio(),
//                suscripcionPremium.costoDeEnvioPara(monitorSamsung)
//        );
//
//        System.out.printf(
//                "Precio del producto: $%d, precio envio: $%d \n",
//                cableHdmi.getPrecio(),
//                suscripcionPremium.costoDeEnvioPara(cableHdmi)
//        );
//        System.out.println("-----------");
    }

}
