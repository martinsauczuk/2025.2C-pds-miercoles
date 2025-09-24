package p06_decorator.decorators;

import p06_decorator.ProcesadorDeDocumento;
import p06_decorator.documentos.Documento;

public abstract class BaseDecorator implements ProcesadorDeDocumento {

    private final ProcesadorDeDocumento procesadorDeDocumento;

    protected BaseDecorator(ProcesadorDeDocumento unProcesadorDeDocumento) {
        procesadorDeDocumento = unProcesadorDeDocumento;
    }

    @Override
    public Documento procesar(Documento unDocumento) {
        return procesadorDeDocumento.procesar(unDocumento); // lo que hace procesador
    }
}
