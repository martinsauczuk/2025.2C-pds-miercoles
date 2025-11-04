package poopMarket;

import poopMarket.categorias.CategoriaConEnvioFijo;
import poopMarket.cupones.estrategiasDeDescuento.DescuentoPorCategoriaStrategy;
import poopMarket.productos.ProductoImpl;

public class Main {

    public static void main(String[] args) {

        CategoriaConEnvioFijo climtizacion = new CategoriaConEnvioFijo("Climatizacion", false);
        ProductoImpl aireAcondicionado = new ProductoImpl(climtizacion, "Aire frio calor", 1500000);

        DescuentoPorCategoriaStrategy cuponClimatizacion = new DescuentoPorCategoriaStrategy(climtizacion, 10);
        System.out.println( cuponClimatizacion.descuentoPara(aireAcondicionado));


    }
}
