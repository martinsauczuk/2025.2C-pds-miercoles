package poopMarket;

import poopMarket.carritos.Carrito;
import poopMarket.cupones.Cupon;
import poopMarket.productos.Producto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarritoImpl implements Carrito {

    private Set<Cupon> cupones = new HashSet<>();
    private List<Producto> productos = new ArrayList<>();

    private final String nombre;

    public CarritoImpl(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void agregarProducto(Producto unProducto) {
        productos.add(unProducto);
    }

    @Override
    public void agregarCupon(Cupon cupon) {
        cupones.add(cupon);
    }

    @Override
    public boolean puedeSerEnviado() {
        return productos
                .stream()
                .allMatch(producto -> producto.tieneEnvio());
    }

    @Override
    public float precioTotal() {
        return sumaDeTodosLosPreciosUnitarios() - sumaDeLosDescuentos();
    }

    private float sumaDeTodosLosPreciosUnitarios() {
        float precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal = precioTotal + producto.precioDeLista();
        }
        return precioTotal;
    }

    private float sumaDeLosDescuentos(){

        float descuentoTotal = 0;
        for (Producto producto : productos) {
            float descuentoParaProducto = 0;
            for (Cupon cupon : cupones) {
                descuentoParaProducto = cupon.descuentoPara(producto);
            }
            descuentoTotal = descuentoTotal + descuentoParaProducto;
        }

        return descuentoTotal;
    }



    @Override
    public Producto elProductoMasCaro() {
        return null;
    }
}
