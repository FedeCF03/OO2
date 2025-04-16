package ar.edu.info.unlp.ejer5p2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimilarStrategy implements ConfiguracionStrategy {

    @Override
    public List<Pelicula> getSugerencias(List<Pelicula> grilla, List<Pelicula> reproducidas) {
        List<Pelicula> sugerencias = new ArrayList<>();
        grilla.stream().filter(p -> !reproducidas.contains(p)).forEach(p -> {
            if (reproducidas.contains(p)) {
                sugerencias.add(p);
            }
        });

        return sugerencias.stream()
                .limit(3)
                .collect(Collectors.toList());
    }

}
