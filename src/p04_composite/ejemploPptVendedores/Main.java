package p04_composite.ejemploPptVendedores;

import p04_composite.ejemploPptVendedores.vendedores.EquipoDeVendedores;
import p04_composite.ejemploPptVendedores.vendedores.Vendedor;
import p04_composite.ejemploPptVendedores.vendedores.VendedorIndividual;

public class Main {

    public static void main(String[] args) {

        VendedorIndividual matias = new VendedorIndividual("VI1");
        VendedorIndividual melina = new VendedorIndividual("VI2");
        VendedorIndividual juli = new VendedorIndividual("VI3");

        matias.setFacturacion(1000);
        melina.setFacturacion(500);
        juli.setFacturacion(100);

        // Vamos a armar un team
        EquipoDeVendedores team665 = new EquipoDeVendedores();
        VendedorIndividual tomas = new VendedorIndividual("VT1");
        tomas.setFacturacion(3000);
        VendedorIndividual melany = new VendedorIndividual("VT2");
        melany.setFacturacion(6000);
        team665.agregar(tomas);
//        team665.agregar(melany);

        EquipoDeVendedores subEquipo = new EquipoDeVendedores();
        subEquipo.agregar(new VendedorIndividual("32342"));
        team665.agregar(subEquipo);

        Empresa companyCompany = new Empresa();
        companyCompany.sumarVendedor(matias);
        companyCompany.sumarVendedor(melina);
        companyCompany.sumarVendedor(juli);
        companyCompany.sumarVendedor(team665);
        companyCompany.sumarVendedor(melany);

        companyCompany.repartirRegalias(1000);

        System.out.println("Cuanto factura: " + companyCompany.facturacionTotal());

        System.out.println(tomas);
        System.out.println(melany);
    }


}