package p06_decorator;


import p06_decorator.decorators.AbrochadoraDecorator;
import p06_decorator.decorators.AnilladoraDecorator;
import p06_decorator.documentos.DocumentoDeTexto;

public class Main {

    public static void main(String[] args) {

        // Documento
        DocumentoDeTexto doc01 = new DocumentoDeTexto("Doc01",3);
        DocumentoDeTexto doc02 = new DocumentoDeTexto("Doc02",5);
        DocumentoDeTexto doc03 = new DocumentoDeTexto("Doc03",41);
        DocumentoDeTexto doc04 = new DocumentoDeTexto("Doc04",2);


        // Impresora solamente
        System.out.println(">>>Impresora");
        ProcesadorDeDocumento impresora = new Impresora();
        impresora.procesar(doc01);
        System.out.println(doc01);
        System.out.printf("-----------------%n");


        // Impresora + abrochadora
        System.out.println(">>>Impresora + abrochadora");
        ProcesadorDeDocumento impresoraAbrochadora = new AbrochadoraDecorator(impresora);
        impresoraAbrochadora.procesar(doc02);
        System.out.println(doc02);
        System.out.printf("-----------------%n");


        // Impresora + abrochadora + Anillado
        System.out.println(">>>Impresora + abrochadora + Anillado");
        ProcesadorDeDocumento impresoraAbrochadoraAnillado = new AnilladoraDecorator(impresoraAbrochadora);
        impresoraAbrochadoraAnillado.procesar(doc03);
        System.out.println(doc03);
        System.out.printf("-----------------%n");

        // Impresora + abrochadora + Anillado
        System.out.println(">>>Impresora + abrochadora + Anillado");
        ProcesadorDeDocumento todoEnUno = new Impresora();
        todoEnUno = new AnilladoraDecorator(todoEnUno);
        todoEnUno = new AbrochadoraDecorator(todoEnUno);
        todoEnUno.procesar(doc04);


        // Impresora + abrochadora + Anillado Mamushka
        System.out.println(">>>Impresora + abrochadora + Anillado");
        ProcesadorDeDocumento mamushka = new AnilladoraDecorator(
                new AbrochadoraDecorator(
                        new Impresora()
                )
        );

        System.out.println(mamushka);


    }

}
