package p02_strategy.ejemploPPTsuscripciones;

import p02_strategy.ejemploPPTsuscripciones.refactor.producto.Producto;

public class Main {

    public static void main(String[] args) {

        SuscripcionBasica suscripcionBasica = new SuscripcionBasica("martin1234");
        SuscripcionPlus suscripcionPlus = new SuscripcionPlus("olivia233");
        SuscripcionPremium suscripcionPremium = new SuscripcionPremium("melina003");

        Producto monitorSamsung = new Producto(200000,"Monitor 24");
        Producto cableHdmi = new Producto(13000,"Cable HDMI reforzado");

        System.out.println("Suscripcion basica ");
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                monitorSamsung.getPrecio(),
                suscripcionBasica.costoDeEnvioPara(monitorSamsung)
        );
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                cableHdmi.getPrecio(),
                suscripcionBasica.costoDeEnvioPara(cableHdmi)
        );
        System.out.println("---------");

        System.out.println("Suscripcion Plus");
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                monitorSamsung.getPrecio(),
                suscripcionPlus.costoDeEnvioPara(monitorSamsung)
        );
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                cableHdmi.getPrecio(),
                suscripcionPlus.costoDeEnvioPara(cableHdmi)
        );
        System.out.println("---------");


        System.out.println("Suscripcion Premium");
        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                monitorSamsung.getPrecio(),
                suscripcionPremium.costoDeEnvioPara(monitorSamsung)
        );

        System.out.printf(
                "Precio del producto: $%d, precio envio: $%d \n",
                cableHdmi.getPrecio(),
                suscripcionPremium.costoDeEnvioPara(cableHdmi)
        );
        System.out.println("-----------");



    }
}
