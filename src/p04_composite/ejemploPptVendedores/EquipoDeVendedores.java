package p04_composite.ejemploPptVendedores;

import java.util.HashSet;

public class EquipoDeVendedores {

    private HashSet<Vendedor> integrantes = new HashSet<>();
    private String nombreDelEquipo;

    public void agregar(Vendedor unVendedor) {
        this.integrantes.add(unVendedor);
    }

    public String getId() {
        return nombreDelEquipo;
    }


}