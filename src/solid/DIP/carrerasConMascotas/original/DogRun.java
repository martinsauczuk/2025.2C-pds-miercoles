package solid.DIP.carrerasConMascotas.original;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * DogRun es una carrera de personas con su perro
 */
public class DogRun {

    private HashSet<CorredorConPerro> corredores = new HashSet<>();

    public void incribir(CorredorConPerro unCorredor) {
        this.corredores.add(unCorredor);
    }

    public Set<String> nombresDeTodosLosPerros() {
        return this.corredores.stream()
                .map(corredor -> corredor.tuPerro().getNombre())
                .collect(Collectors.toSet());
    }

}
