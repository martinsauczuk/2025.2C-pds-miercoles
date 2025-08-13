package p01_template_method;

public abstract class Cafe {

    private int cantidadCafe = 0;
    private boolean tieneSobreEndulzante = false;
    private boolean estaEntregado = false;

    // Template Method: "la receta".
    public void preparar() {
        this.llenarCafe(330);      // 1 no se negocia
        this.presentar();                     // 2 depende de la implementacion
        this.agregarSobresEndulzante();       // 3 no se negocia
        this.entregarAlCliente();             // 4 no se negocia
    }


    protected boolean fueEntregado(){
        return this.estaEntregado;
    }

    // paso 1 no se negocia
    protected void llenarCafe(int unaCantidad) {
        System.out.printf(">Agregando %d ml de cafe... \n", unaCantidad);
        this.cantidadCafe = unaCantidad;
    }

    // paso 2 cada cafe lo implementa como "quiere"
    protected abstract void presentar();

    // Paso 4 no se negocia
    protected void entregarAlCliente() {
        System.out.println(">Entregando al cliente...");
        this.estaEntregado = true;
    }

    // paso 3 no se negocia
    protected void agregarSobresEndulzante() {
        System.out.println(">Agregando sobre de enduzante...");
        this.tieneSobreEndulzante = true;
    }

}
