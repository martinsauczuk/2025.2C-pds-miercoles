package p01_template_method;

public class CafeConsumoLocal extends Cafe{

    private boolean tieneCuchara = false;
    private boolean tienePlatito = false;

    @Override
    protected void presentar() {
        this.tieneCuchara = true;
        this.tienePlatito = true;
    }
}
