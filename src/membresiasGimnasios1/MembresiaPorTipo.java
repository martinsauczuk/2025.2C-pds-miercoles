package membresiasGimnasios1;

public class MembresiaPorTipo extends Membresia {

    private TipoDeActividad tipoDeActividad;

    @Override
    public boolean podesRealizar(Actividad unaActividad) {
        return unaActividad.getTipo() == this.tipoDeActividad;
    }
}
