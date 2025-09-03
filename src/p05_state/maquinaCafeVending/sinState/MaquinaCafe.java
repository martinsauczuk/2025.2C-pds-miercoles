package p05_state.maquinaCafeVending.sinState;

public class MaquinaCafe {

    private int cantidadAzucarSeleccionada = 3;
    private int contadorCafes = 0;
    private int contadorCortados = 0;

    private String mensaje;

    public String indicacionDisplay() {
        return "";
    }

    public void btnMasAzucar() {
        cantidadAzucarSeleccionada = cantidadAzucarSeleccionada < 5
                ? cantidadAzucarSeleccionada + 1
                : cantidadAzucarSeleccionada;

    }

    public void btnMenosAzucar() {
        cantidadAzucarSeleccionada = cantidadAzucarSeleccionada > 0
                ? cantidadAzucarSeleccionada - 1
                : cantidadAzucarSeleccionada;
    }

    public int getCantidadAzucarSeleccionada() {
        return cantidadAzucarSeleccionada;
    }

    public void acercarTarjetaCredito() {

    }

    public void btnCafeSolo() {

    }

    public void btnCafeCortado() {


    }


}
