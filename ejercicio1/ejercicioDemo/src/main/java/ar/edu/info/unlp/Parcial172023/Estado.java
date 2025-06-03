package ar.edu.info.unlp.Parcial172023;

public interface Estado {

    public long calcularTiempoUtilizado(TareaSimple tarea);

    public void iniciar(TareaSimple tarea);

    public void completar(TareaSimple tarea);

}
