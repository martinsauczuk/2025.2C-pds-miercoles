package p06_decorator.decorators;

import p06_decorator.ProcesadorDeDocumento;
import p06_decorator.documentos.Documento;

public class AnilladoraDecorator extends BaseDecorator{

    public AnilladoraDecorator(ProcesadorDeDocumento procesadorDeDocumento) {
        super(procesadorDeDocumento);
    }

    @Override
    public Documento procesar(Documento unDocumento) {
        Documento unDocumentoYaProcesado = super.procesar(unDocumento); // lo que hace BaseDecorator
        System.out.printf("Anillando documento...%d paginas %n", unDocumento.cantidadDePaginas());
        unDocumentoYaProcesado.abrochar();
        return unDocumentoYaProcesado;
    }
}


