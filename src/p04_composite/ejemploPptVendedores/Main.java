package p04_composite.ejemploPptVendedores;

public class Main {

    public static void main(String[] args) {

        Vendedor matias = new Vendedor("V10");
        Vendedor melina = new Vendedor("V11");
        Vendedor juli = new Vendedor("V13");

        Empresa companyCompany = new Empresa();
        companyCompany.sumarVendedor(matias);
        companyCompany.sumarVendedor(melina);
        companyCompany.sumarVendedor(juli);

        System.out.println(matias);
        System.out.println(melina);
        System.out.println(juli);

    }


}