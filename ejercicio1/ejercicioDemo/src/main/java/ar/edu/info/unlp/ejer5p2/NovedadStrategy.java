package ar.edu.info.unlp.ejer5p2;

import java.util.List;

public class NovedadStrategy implements ConfiguracionStrategy {

    @Override
    public List<Pelicula> getSugerencias(List<Pelicula> grilla, List<Pelicula> reproducidas) {
        List<Pelicula> sugerencias = grilla.stream()
                .filter(p -> !reproducidas.contains(p))
                .sorted((p1, p2) -> Integer.compare(p2.getAnio(), p1.getAnio()))
                .limit(3)
                .toList();

        return sugerencias;
    }

}
