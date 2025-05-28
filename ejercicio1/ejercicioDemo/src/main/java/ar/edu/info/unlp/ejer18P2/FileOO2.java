package ar.edu.info.unlp.ejer18P2;

import java.time.LocalDate;

public class FileOO2 {
    private String nombre;
    private String extension;
    private int tamano;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String permisos;
    private ConcretePrinter printer;

    public FileOO2(String nombre, String extension, int tamaño, LocalDate fechaCreacion, LocalDate fechaModificacion,
            String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamano = tamaño;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.permisos = permisos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getExtension() {
        return extension;
    }

    public int getTamano() {
        return tamano;
    }

    public String getFechaCreacion() {
        return fechaCreacion.toString();
    }

    public String getFechaModificacion() {
        return fechaModificacion.toString();
    }

    public String getPermisos() {
        return permisos;
    }

}
