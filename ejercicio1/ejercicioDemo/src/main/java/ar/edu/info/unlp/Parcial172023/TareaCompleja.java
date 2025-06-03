package ar.edu.info.unlp.Parcial172023;

import java.util.List;

public class TareaCompleja extends Tarea {
    private List<Tarea> tareas;

    public TareaCompleja(String descripcion, String nombre, List<Tarea> tareas) {
        super(descripcion, nombre);
    }

    @Override
    public void iniciar() {
        tareas.forEach(Tarea::iniciar);
    }

    @Override
    public void completar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int EstimarDuracion() {
        return tareas.stream()
                .mapToInt(Tarea::EstimarDuracion)
                .sum();
    }

    @Override
    public long TiempoUtilizadoTarea() {
        return tareas.stream()
                .mapToLong(Tarea::TiempoUtilizadoTarea)
                .sum();
    }

    @Override
    public double avanceDeTareas() {
        int estimacionTotal = tareas.stream()
                .mapToInt(Tarea::EstimarDuracion)
                .sum();
        long tiempoUtilizadoTotal = tareas.stream()
                .mapToLong(Tarea::TiempoUtilizadoTarea)
                .sum();

        return tiempoUtilizadoTotal / estimacionTotal;
    }

}
