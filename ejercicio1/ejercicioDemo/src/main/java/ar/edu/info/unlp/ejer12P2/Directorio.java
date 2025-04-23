package ar.edu.info.unlp.ejer12P2;

import java.time.LocalDate;
import java.util.List;

public class Directorio implements Elemento {

    private String Nombre;
    private LocalDate fechaDeCreación;
    private List<Elemento> elementos;

    public Directorio(String nombre, LocalDate fechaDeCreación) {
        this.Nombre = nombre;
        this.fechaDeCreación = fechaDeCreación;
    }

    @Override
    public double tamanoTotalOcupado() {
        double total = elementos.stream().mapToDouble(e -> e.tamanoTotalOcupado()).sum();
        return total + 32; // 32 bytes para el directorio
    }

    @Override
    public Archivo archivoMasGrande() {
        return elementos.stream().map(e -> e.archivoMasGrande())
                .max((a1, a2) -> Double.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado())).orElse(null);

    }

    @Override
    public Archivo archivoMasNuevo() {
        return elementos.stream().map(e -> e.archivoMasNuevo())
                .max((a1, a2) -> a1.getFechaDeCreacion().compareTo(a2.getFechaDeCreacion())).orElse(null);
    }

    @Override
    public Elemento buscar(String nombre) {
        Elemento encontrado = elementos.stream().filter(e -> e.getNombre().equals(nombre)).findFirst().orElse(null);
        if (encontrado == null) {
            elementos.stream().map(e -> e.buscar(nombre)).filter(e -> e.getNombre() != nombre).findFirst().orElse(null);
        }
    }

    @Override
    public List<Elemento> buscarTodos(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String listadoDeContenido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
