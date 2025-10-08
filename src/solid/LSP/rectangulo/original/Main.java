package solid.LSP.rectangulo.original;

public class Main {

    public static void main(String[] args) {

        // Mi rectangulo
        Rectangulo unRectangulo = new Rectangulo();
        unRectangulo.setAncho(10);
        unRectangulo.setLargo(5);
        System.out.printf("El area del rectangulo es %d %n", unRectangulo.calcularArea());


        Cuadrado unCuadrado = new Cuadrado();
        unCuadrado.setAncho(10);
        System.out.printf("El area del cuadrado es %d %n", unCuadrado.calcularArea());
        unCuadrado.setAncho(9);
        System.out.printf("El area del cuadrado es %d %n", unCuadrado.calcularArea());


        // Vamos a reemplazarlo por un Cuadrado
        unRectangulo  = new Cuadrado(); // Dijimos que un Cuadrado "es un" Rectangulo
        unRectangulo.setLargo(10);
        unRectangulo.setAncho(5);
        System.out.printf("El area del rectangulo es %d %n", unRectangulo.calcularArea());

    }

}
