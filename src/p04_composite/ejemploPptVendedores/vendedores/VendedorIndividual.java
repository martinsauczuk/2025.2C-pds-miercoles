package p04_composite.ejemploPptVendedores.vendedores;

public class VendedorIndividual implements Vendedor{

    private final String id;
    private float facturacion;
    private float ganancia;

    public VendedorIndividual(String id) {
        this.id = id;
    }

    public void setFacturacion(float facturacion) {
        this.facturacion = facturacion;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public float cuandoFacturas() {
        return facturacion;
    }

    @Override
    public float cuantoGanas() {
        return ganancia;
    }

    @Override
    public void recibirComision(float unImporte) {
        ganancia = ganancia + unImporte;
    }
}
