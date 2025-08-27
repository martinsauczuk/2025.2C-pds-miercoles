package p03_builder.salones;


import p03_builder.salones.componentes.catering.Catering;
import p03_builder.salones.componentes.escenario.Escenario;
import p03_builder.salones.componentes.mobiliarios.Mobiliario;
import p03_builder.salones.componentes.musicalizacion.Musicalizacion;
import p03_builder.salones.componentes.shows.Show;
import p03_builder.salones.componentes.sistemasDeAcceso.SistemaDeAcceso;

public class Salon {

    private final String id;
    private final Musicalizacion musicalizacion;
    private final Catering catering;
    private final Mobiliario mobiliario;
    private final Escenario escenario;
    private final SistemaDeAcceso sistemaDeAcceso;
    private final Show show;


    /*
        Unico constructor "gigante"
     */
    public Salon(String id,
                 Musicalizacion musicalizacion,
                 Catering catering,
                 Mobiliario mobiliario,
                 Escenario escenario,
                 SistemaDeAcceso sistemaDeAcceso,
                 Show show
    ) {
        this.id = id;
        this.musicalizacion = musicalizacion;
        this.catering = catering;
        this.mobiliario = mobiliario;
        this.escenario = escenario;
        this.sistemaDeAcceso = sistemaDeAcceso;
        this.show = show;
    }

}
