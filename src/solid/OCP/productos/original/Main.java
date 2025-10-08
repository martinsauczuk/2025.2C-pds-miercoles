package solid.OCP.productos.original;

public class Main {

    public static void main(String[] args) {

        Producto auricularesSony = new Producto(14000, "Auriculares");
        System.out.println(auricularesSony.precioConImpuestos());

        Producto cigarrillosMarlboro = new Producto(4455, "Marlboro Box");
        System.out.println(cigarrillosMarlboro.precioConImpuestos());



    }


}
