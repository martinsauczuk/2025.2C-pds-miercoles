package p07_observer.ejemploPresentacion.observadores;

public class Economista implements Observador {


    @Override
    public void actualizar(float precioUsd) {
        System.out.printf("Soy un pedidista y voy a publicar el precio del USD %f %n", precioUsd);
    }
}
