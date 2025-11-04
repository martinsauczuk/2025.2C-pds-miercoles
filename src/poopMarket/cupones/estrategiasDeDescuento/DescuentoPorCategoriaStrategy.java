package poopMarket.cupones.estrategiasDeDescuento;

import poopMarket.categorias.Categoria;
import poopMarket.productos.Producto;

public class DescuentoPorCategoriaStrategy implements EstategiaDescuento {

    private final Categoria categoria;
    private final float porcentajeDescuento;

    public DescuentoPorCategoriaStrategy(Categoria categoria, float porcentajeDescuento) {
        this.categoria = categoria;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public float descuentoPara(Producto unProducto) {

        return unProducto.categoria().equals(categoria)
                ? unProducto.precioDeLista() * porcentajeDescuento / 100
                : 0;

//        float descuento = 0;
//        if (unProducto.categoria().equals(categoria) ) {
//            descuento = unProducto.precioDeLista() * porcentajeDescuento / 100;
//        }
//        return descuento;

    }

}
