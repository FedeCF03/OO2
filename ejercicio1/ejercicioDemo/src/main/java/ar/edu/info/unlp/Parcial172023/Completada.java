package ar.edu.info.unlp.Parcial172023;

public class Completada implements Estado {

    @Override
    public long calcularTiempoUtilizado(TareaSimple tarea) {
        return tarea.getTiempoUtilizado();
    }

    @Override
    public void iniciar(TareaSimple tarea) {
        throw new UnsupportedOperationException("No se puede iniciar una tarea completada.");
    }

    @Override
    public void completar(TareaSimple tarea) {
        throw new UnsupportedOperationException("La tarea ya está completada.");
    }

}
