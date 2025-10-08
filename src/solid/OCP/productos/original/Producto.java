package solid.OCP.productos.original;

public class Producto {

    private final float precioDeLista;
    private final String nombre;
    private float descuento;

    public Producto(float precioDeLista, String nombre) {
        this.precioDeLista = precioDeLista;
        this.nombre = nombre;
    }

    public float precioDeLista() {
        return precioDeLista;
    }

    public float precioConImpuestos() {
        return precioDeLista * 1.21f; // precio con IVA
    }

}
