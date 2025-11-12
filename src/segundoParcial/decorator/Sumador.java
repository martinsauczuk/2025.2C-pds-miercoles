package segundoParcial.decorator;

import segundoParcial.Participante;
import segundoParcial.compras.Compra;

public class Sumador extends CompraDecorator{

    private final int adicional;

    public Sumador(Compra compra, int adicional) {
        super(compra);
        this.adicional = adicional;
    }

    @Override
    public int millasQueOtorgaPara(Participante unParticipante) {
        return super.millasQueOtorgaPara(unParticipante) + adicional;
    }
}
