package ar.edu.info.unlp.Parcial172023;

public class Pendiente implements Estado {

    @Override
    public long calcularTiempoUtilizado(TareaSimple tarea) {
        return 0;
    }

    @Override
    public void iniciar(TareaSimple tarea) {
        tarea.setFechaInicio();
        tarea.setEstado(new Iniciada());

    }

    @Override
    public void completar(TareaSimple tarea) {
        throw new UnsupportedOperationException("No se puede completar una tarea pendiente.");
    }

}
