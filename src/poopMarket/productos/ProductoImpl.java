package poopMarket.productos;

import poopMarket.categorias.Categoria;

public class ProductoImpl implements Producto{

    private final Categoria categoria;
    private final String descripcion;
    private float precioDeLista;

    public ProductoImpl(Categoria categoria, String descripcion, float precioInicial) {
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precioDeLista = precioInicial;
    }

    @Override
    public float precioDeLista() {
        return precioDeLista;
    }

    @Override
    public String descripcion() {
        return descripcion;
    }

    @Override
    public Categoria categoria() {
        return categoria;
    }

    @Override
    public boolean tieneEnvio() {
        return categoria.tieneEnvio();
    }
}
