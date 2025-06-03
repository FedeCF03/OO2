package ar.edu.info.unlp.parcial862024;

public class PrestamoSimple extends TipoPrestamo {
    private double tasaInteres;

    @Override
    public double calcularCuota(double monto, int cuotas) {
        return (monto / cuotas) * 
    }

}
