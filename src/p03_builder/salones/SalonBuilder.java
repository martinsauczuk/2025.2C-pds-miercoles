package p03_builder.salones;

import p03_builder.salones.componentes.catering.Catering;
import p03_builder.salones.componentes.escenario.Escenario;
import p03_builder.salones.componentes.mobiliarios.Mobiliario;
import p03_builder.salones.componentes.musicalizacion.Musicalizacion;
import p03_builder.salones.componentes.shows.Show;
import p03_builder.salones.componentes.sistemasDeAcceso.SistemaDeAcceso;

public class SalonBuilder {

    private String id;
    private Musicalizacion musicalizacion;
    private Catering catering;
    private Mobiliario mobiliario;
    private Escenario escenario;
    private SistemaDeAcceso sistemaDeAcceso;

    //La agregamos despues
    private Show show;


    public SalonBuilder id(String id) {
        this.id = id;
        return this;
    }

    public SalonBuilder musicalizacion(Musicalizacion musicalizacion) {
        this.musicalizacion = musicalizacion;
        return this;
    }

    public SalonBuilder catering(Catering catering) {
        this.catering = catering;
        return this;
    }

    public SalonBuilder mobiliario(Mobiliario mobiliario) {
        this.mobiliario = mobiliario;
        return this;
    }

    public SalonBuilder escenario(Escenario escenario) {
        this.escenario = escenario;
        return this;
    }

    public SalonBuilder acceso(SistemaDeAcceso sistemaDeAcceso) {
        this.sistemaDeAcceso = sistemaDeAcceso;
        return this;
    }

    // Agregado despues
    public SalonBuilder show(Show show) {
        this.show = show;
        return this;
    }

    // Devolvemos el objeto ya terminado
    public Salon build() {

        return new Salon(
                this.id,
                this.musicalizacion,
                this.catering,
                this.mobiliario,
                this.escenario,
                this.sistemaDeAcceso,
                this.show
        );
    }



}
