package poopMarket.categorias;

public class CategoriaConEnvioFijo implements Categoria{

    private boolean envio;
    private final String descripcion;

    public CategoriaConEnvioFijo(String descripcion, boolean envio) {
        this.descripcion = descripcion;
        this.envio = envio;
    }


    @Override
    public String descripcion() {
        return descripcion;
    }

    @Override
    public boolean tieneEnvio() {
        return envio;
    }
}
