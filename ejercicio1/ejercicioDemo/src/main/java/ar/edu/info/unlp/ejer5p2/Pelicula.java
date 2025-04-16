package ar.edu.info.unlp.ejer5p2;

import java.util.List;

public class Pelicula {
    private String titulo;
    private double puntaje;
    private int anio;
    private List<Pelicula> similares;

    public Pelicula(String titulo, double puntaje, int anio, List<Pelicula> similares) {
        this.titulo = titulo;
        this.puntaje = puntaje;
        this.anio = anio;
        this.similares = similares;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public int getAnio() {
        return anio;
    }

    public void agregarSimilar(Pelicula pelicula) {
        this.similares.add(pelicula);
    }
}
