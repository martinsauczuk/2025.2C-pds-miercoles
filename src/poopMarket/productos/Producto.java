package poopMarket.productos;

import poopMarket.categorias.Categoria;

public interface Producto {

    float precioDeLista();

    String descripcion();

    Categoria categoria();

    boolean tieneEnvio();
}
