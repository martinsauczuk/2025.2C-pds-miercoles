package p06_decorator.decorators;

import p06_decorator.ProcesadorDeDocumento;
import p06_decorator.documentos.Documento;

public class AbrochadoraDecorator extends BaseDecorator{

    public AbrochadoraDecorator(ProcesadorDeDocumento procesadorDeDocumento) {
        super(procesadorDeDocumento);
    }

    @Override
    public Documento procesar(Documento unDocumento) {
        Documento unDocumentoYaimpreso = super.procesar(unDocumento); // lo que hace BaseDecorator
        System.out.printf("Abrochar documento...%d paginas %n", unDocumento.cantidadDePaginas());
        unDocumentoYaimpreso.abrochar();
        return unDocumentoYaimpreso;
    }
}


