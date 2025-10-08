package solid.SRP.dron.original;

public class Dron {

    private static final float CONSTANTE_DE_VUELO = 0.34f ;
    private float porcentajeDeBateria;

    public void iniciarGrabacion() {
        //
    }

    public void pausarGrabacion() {
        //
    }

    public void volverAlOrigen() {
        // Implementacion
    }

    public float cuantaBateriaTeQueda() {
        // Implementacion
        return porcentajeDeBateria;
    }

    public float cuantosMinutosDeVueloTeQuedan() {
        return porcentajeDeBateria * CONSTANTE_DE_VUELO; // Algun calculo
    }


}
