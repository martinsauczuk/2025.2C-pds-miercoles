package solid.DIP.carrerasConMascotas.refactor.corredores.acompaniantes;

public class PerroMestizoAdoptado extends Perro{

    private String refugio;

    public PerroMestizoAdoptado(int edad, String nombre) {
        super(edad, nombre);
    }

    String nombreDelRefugioQueVino() {
        return refugio;
    }
}
