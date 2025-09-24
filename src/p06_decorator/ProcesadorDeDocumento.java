package p06_decorator;


import p06_decorator.documentos.Documento;

public interface ProcesadorDeDocumento {
    Documento procesar(Documento unDocumento);
}
