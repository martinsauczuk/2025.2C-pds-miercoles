package p04_composite.ejemploPptVendedores.vendedores;

import java.util.HashSet;

public class EquipoDeVendedores implements Vendedor {

    private HashSet<Vendedor> integrantes = new HashSet<>();
    private String nombreDelEquipo;

    public void agregar(Vendedor unVendedor) {
        this.integrantes.add(unVendedor);
    }

    public String getId() {
        return nombreDelEquipo;
    }

    @Override
    public float cuandoFacturas() {

        float total = 0;
        for (Vendedor unIntegrante : integrantes) {
            total = total + unIntegrante.cuandoFacturas();
        }
        return total;
    }

    @Override
    public float cuantoGanas() {
        return 0;
    }

    @Override
    public void recibirComision(float unImporte) {

        float cuantoAcadaIntegrante = unImporte / integrantes.size();
        for (Vendedor unIntegrante : integrantes) {
            unIntegrante.recibirComision(cuantoAcadaIntegrante);
        }
    }


}