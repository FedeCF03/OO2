package ar.edu.info.unlp.Parcial172023;

public abstract class Tarea {
    private String descripcion;
    private String nombre;

    public Tarea(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public abstract void iniciar();

    public abstract void completar();

    public abstract int EstimarDuracion();

    public abstract long TiempoUtilizadoTarea();

    public abstract double avanceDeTareas();

    protected long getTiempoUtilizado() {
        return 0; // Este método debe ser implementado en las
    }
}
