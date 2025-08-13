package p01_template_method;

public class CafeParaLlevar extends Cafe {

    private boolean tieneEmbalaje = false;

    @Override
    protected void presentar() {
        this.tieneEmbalaje = true;
    }


    public void calentarExtra() {
        // Metodo propio de CafeParaLlevar. No tiene nada que ver con el patron
    }
}
