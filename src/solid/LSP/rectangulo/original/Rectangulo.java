package solid.LSP.rectangulo.original;

public class Rectangulo {

    protected int ancho;
    protected int largo;

    public int calcularArea() {
        return ancho * largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}
