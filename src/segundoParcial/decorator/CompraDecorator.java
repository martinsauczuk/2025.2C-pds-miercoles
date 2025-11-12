package segundoParcial.decorator;

import segundoParcial.Participante;
import segundoParcial.compras.Compra;

public abstract class CompraDecorator implements Compra {

    private final Compra compra;

    protected CompraDecorator(Compra compra) {
        this.compra = compra;
    }

    @Override
    public int millasQueOtorgaPara(Participante unParticipante) {
        return compra.millasQueOtorgaPara(unParticipante);
    }


}
