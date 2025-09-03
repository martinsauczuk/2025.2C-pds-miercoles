package p04_composite.ejemploPptVendedores;

import java.util.HashSet;

public class Empresa {

    private HashSet<Vendedor> vendedores = new HashSet<>();


    public void sumarVendedor(Vendedor unVendedor) {
        this.vendedores.add(unVendedor);
    }

    public void repartirRegalias(float cuantoAcadaVendedor) {

        for (Vendedor vendedor : this.vendedores) {
            vendedor.recibirComision(cuantoAcadaVendedor);
        }

    }
}