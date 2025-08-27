package p03_builder.salones.componentes.mobiliarios;

public class MobiliarioDeSillas implements Mobiliario{

    private int cantSillas;


    public MobiliarioDeSillas(int cantSillas) {
        this.cantSillas = cantSillas;
    }

    @Override
    public int cantPersonasSentadas() {
        return 0;
    }
}
