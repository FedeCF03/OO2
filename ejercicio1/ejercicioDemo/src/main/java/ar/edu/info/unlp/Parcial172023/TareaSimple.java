package ar.edu.info.unlp.Parcial172023;

public class TareaSimple extends Tarea {
    private int duracionEstimada;
    private int tiempoUtilizado;
    private Long fechaInicio;
    private Long fechaFin;
    private Estado estado;

    public TareaSimple(String descripcion, String nombre, int duracionEstimada) {
        super(descripcion, nombre);
        this.duracionEstimada = duracionEstimada;
        this.estado = new Pendiente();
    }

    @Override
    public void iniciar() {
        estado.iniciar(this);
    }

    @Override
    public void completar() {
        estado.completar(this);
    }

    @Override
    public int EstimarDuracion() {
        return duracionEstimada;
    }

    @Override
    public long TiempoUtilizadoTarea() {
        return estado.calcularTiempoUtilizado(this);
    }

    @Override
    public double avanceDeTareas() {
        return 0.0;
    }

    @Override
    public long getTiempoUtilizado() {
        return fechaFin - fechaInicio;
    }

    public void setFechaInicio() {
        this.fechaInicio = System.currentTimeMillis();
    }

    public void setFechaFin() {
        this.fechaFin = System.currentTimeMillis();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
