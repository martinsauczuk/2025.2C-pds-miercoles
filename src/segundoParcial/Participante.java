package segundoParcial;


import segundoParcial.compras.Compra;

public interface Participante {

    /**
     * Describe la cantidad total de millas que tien el participante
     */
    int cantidadDeMillasTotales();

    /**
     * Cargar una compra para acumular millas
     * @param unaCompra Compra a cargar
     */
    void cargarCompra(Compra unaCompra);

}
