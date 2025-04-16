package ar.edu.info.unlp.ejer5p2;

import java.util.List;

public interface ConfiguracionStrategy {
    public List<Pelicula> getSugerencias(List<Pelicula> grilla, List<Pelicula> reproducidas);
}
