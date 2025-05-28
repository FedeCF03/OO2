import ar.edu.unlp.info.oo2.facturacion_llamadas.Llamada;

public class Internacional extends Llamada {
    private int cuil;

    public Internacional(String origen, String destino, int duracion, int precioPorSegundo, int cuil) {
        super(origen, destino, duracion, precioPorSegundo);
        this.cuil = cuil;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 50;
    }

}
