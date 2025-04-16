package ar.edu.info.unlp.ejer5p2;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    private List<Pelicula> grilla;
    private List<Pelicula> reproducidas;
    private ConfiguracionStrategy configuracionStrategy;

    public Decodificador() {
        this.grilla = new ArrayList<>();
        this.reproducidas = new ArrayList<>();
        this.configuracionStrategy = new PuntajeStrategty();

    }

    public List<Pelicula> getSugerencias() {
        return configuracionStrategy.getSugerencias(grilla, reproducidas);
    }

    public void setConfiguracionStrategy(ConfiguracionStrategy configuracionStrategy) {
        this.configuracionStrategy = configuracionStrategy;
    }

    public void agregarPelicula(Pelicula pelicula) {
        this.grilla.add(pelicula);
    }
}
