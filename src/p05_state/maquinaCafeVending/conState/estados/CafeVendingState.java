package p05_state.maquinaCafeVending.conState.estados;

public interface CafeVendingState {

    void seleccionCafeSolo();
    void seleccionCafeCortado();
    String indicacionDisplay();

    void confirmarPago();

}
