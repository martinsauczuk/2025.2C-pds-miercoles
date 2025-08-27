package p03_builder.salones;


import p03_builder.salones.componentes.catering.Catering;
import p03_builder.salones.componentes.escenario.Escenario;
import p03_builder.salones.componentes.mobiliarios.MobiliarioDeSillas;
import p03_builder.salones.componentes.musicalizacion.Musicalizacion;
import p03_builder.salones.componentes.mobiliarios.MobiliarioDeVallas;
import p03_builder.salones.componentes.mobiliarios.MobiliarioMesas;
import p03_builder.salones.componentes.sistemasDeAcceso.SistemaDeAccesoPlanilla;
import p03_builder.salones.componentes.sistemasDeAcceso.SistemaDeAccesoQr;
import p03_builder.salones.componentes.sistemasDeAcceso.SistemaDeIngresoPulseras;

public class Main {

    public static void main(String[] args) {

        /*
            Salon para casamientos:
                - Musicalizacion
                - Catering
                - Mobiliario de sillas y mesas
                - Control de acceso por planilla
             Salon para Conferencia:
                 - Moviliario con sillas
                 - Control de acceso con pulseras
             Salon para acreditaciones
                 - Mobiliario de vallas
                 - Sistema de acceso con QR
         */

        // Configurar salon para casamiento de Seba y Mery para 80 personas
        Salon salonCasamientoSebaYMery = new Salon(
                "S4324",
                new Musicalizacion(),
                new Catering(80),
                new MobiliarioMesas(10,8),
                null,
                new SistemaDeAccesoPlanilla()
        );

        // Configurar salon para una conferencia de Alan Kay para 200 personas
        Salon conferenciaAlanKay200p = new Salon(
                "S4464",
                null,
                null,
                new MobiliarioDeSillas(200),
                new Escenario(),
                new SistemaDeIngresoPulseras()
        );

        // Configurar salon para una conferencia de Alan Kay para 200 personas
        Salon acreditacionMaratonBA = new Salon(
                "S356",
                null,
                null,
                new MobiliarioDeVallas(),
                null,
                new SistemaDeAccesoQr()
        );

        System.out.println(salonCasamientoSebaYMery);
        System.out.println(conferenciaAlanKay200p);
        System.out.println(acreditacionMaratonBA);






    }


}
