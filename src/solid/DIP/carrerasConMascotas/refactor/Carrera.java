package solid.DIP.carrerasConMascotas.refactor;

import solid.DIP.carrerasConMascotas.refactor.corredores.CorredorConAcompaniante;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


/**
 */
public class Carrera {

    private HashSet<CorredorConAcompaniante> corredores = new HashSet<>();

    public void incribir(CorredorConAcompaniante unCorredor) {
        this.corredores.add(unCorredor);
    }

    public Set<String> nombreDeTodosLosAcompaniantes() {
        return this.corredores.stream()
                .map(corredor -> corredor.tuAcompaniante().tuNombre())
                .collect(Collectors.toSet());
    }

}
