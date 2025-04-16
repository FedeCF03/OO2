package ar.edu.info.unlp.ejer5p2;

import java.util.List;

public class PuntajeStrategty implements ConfiguracionStrategy {

    @Override
    public List<Pelicula> getSugerencias(List<Pelicula> grilla, List<Pelicula> reproducidas) {
        List<Pelicula> sugerencias = grilla.stream()
                .filter(p -> !reproducidas.contains(p))
                .sorted((p1, p2) -> Double.compare(p2.getPuntaje(), p1.getPuntaje()))
                .limit(3)
                .toList();

        return sugerencias;
    }

}
