package p02_strategy.ejemploPPTsuscripciones.refactor.producto;

public class Producto {

    private int precio;
    private String descripcion;

    public Producto(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }
}
