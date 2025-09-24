package p06_decorator;


import p06_decorator.documentos.Documento;

public class Impresora implements ProcesadorDeDocumento{

    public Documento procesar(Documento unDocumento) {
        System.out.printf("Impriendo documento...%d paginas %n", unDocumento.cantidadDePaginas());
        unDocumento.imprimir();
        return unDocumento;
    }

}
