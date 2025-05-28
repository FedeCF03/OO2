import ar.edu.unlp.info.oo2.facturacion_llamadas.Cliente;

public class Juridica extends Cliente {
    private String cuit;

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public double aplicarDescuento(double monto, double descuento) {
        return super.aplicarDescuento(monto, 0.15);
    }

    @Override
    public double calcularMontoTotalLlamadas() {
        double monto = super.calcularMontoTotalLlamadas();
        return monto - (monto * 0.15);
    }

}
