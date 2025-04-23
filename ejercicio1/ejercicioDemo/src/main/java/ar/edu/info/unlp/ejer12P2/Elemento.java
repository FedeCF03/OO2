package ar.edu.info.unlp.ejer12P2;

import java.util.List;

public interface Elemento {

    public int tamanoTotalOcupado();

    public Archivo archivoMasGrande();

    public Archivo archivoMasNuevo();

    public Elemento buscar(String nombre);

    public List<Elemento> buscarTodos(String nombre);

    public String listadoDeContenido();
}
