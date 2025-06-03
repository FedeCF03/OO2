package ar.edu.info.unlp.Parcial172023;

public class Iniciada implements Estado {

    @Override
    public long calcularTiempoUtilizado(TareaSimple tarea) {
        return 0;
    }

    @Override
    public void iniciar(TareaSimple tarea) {
        throw new UnsupportedOperationException("La tarea ya está iniciada.");
    }

    @Override
    public void completar(TareaSimple tarea) {
        tarea.setFechaFin();
        tarea.setEstado(new Completada());
    }

}
