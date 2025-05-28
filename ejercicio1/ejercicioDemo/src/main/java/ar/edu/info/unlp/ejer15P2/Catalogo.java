package ar.edu.info.unlp.ejer15P2;

import java.util.List;

public class Catalogo {
    private List<Componente> componentes;

    public Componente getComponentes(String desc) {
        return this.componentes.stream()
                .filter(c -> c.getDescripcion().equals(desc))
                .findFirst()
                .orElse(null);
    }
}
