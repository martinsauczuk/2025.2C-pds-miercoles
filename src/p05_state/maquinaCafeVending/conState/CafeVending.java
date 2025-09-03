package p05_state.maquinaCafeVending.conState;

import p05_state.maquinaCafeVending.conState.estados.CafeVendingState;
import p05_state.maquinaCafeVending.conState.estados.Inactivo;

public class CafeVending {

    private int cantidadAzucarSeleccionada = 3;
    private int contadorCafes = 0;
    private int contadorCortados = 0;

    private CafeVendingState estadoActual = new Inactivo(this);


    public void setEstadoActual(CafeVendingState estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String indicacionDisplay() {
        return this.estadoActual.indicacionDisplay();
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
        this.estadoActual.confirmarPago();
    }

    public void btnCafeSolo() {
        this.estadoActual.seleccionCafeSolo();
    }

    public void btnCafeCortado() {
        this.estadoActual.seleccionCafeCortado();
    }
}
