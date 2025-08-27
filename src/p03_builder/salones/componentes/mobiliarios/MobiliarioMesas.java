package p03_builder.salones.componentes.mobiliarios;

public class MobiliarioMesas implements Mobiliario{

    private int cantMesas;
    private int cantSillasPorMesa;

    public MobiliarioMesas(int cantMesas, int cantSillasPorMesa) {
        this.cantMesas = cantMesas;
        this.cantSillasPorMesa = cantSillasPorMesa;
    }

    @Override
    public int cantPersonasSentadas() {
        return cantMesas * cantSillasPorMesa;
    }
}
