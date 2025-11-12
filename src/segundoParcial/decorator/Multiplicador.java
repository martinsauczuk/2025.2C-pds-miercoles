package segundoParcial.decorator;

import segundoParcial.Participante;
import segundoParcial.compras.Compra;

public class Multiplicador extends CompraDecorator{

    private final int factor;

    public Multiplicador(Compra unaCompra, int factor) {
        super(unaCompra);
        this.factor = factor;
    }

    @Override
    public int millasQueOtorgaPara(Participante unParticipante) {
        return super.millasQueOtorgaPara(unParticipante) * factor;
    }
}
