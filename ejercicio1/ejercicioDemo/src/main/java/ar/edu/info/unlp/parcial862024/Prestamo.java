package ar.edu.info.unlp.parcial862024;

public abstract class Prestamo {
    private double monto;
    private int cuotas;
    private Cliente cliente;
    private EstadoPrestamo estado;
    private int contadorCuotas;
    private double MontoRestante;

    public Prestamo(double monto, int cuotas, Cliente cliente) {
        this.monto = monto;
        this.cuotas = cuotas;
        this.cliente = cliente;

        if (superaMontoCliente()) {
            this.estado = new Rechaza();
        } else {
            this.estado = new Aceptado();
        }
        this.MontoRestante = monto;
    }

    public double calcularCuota() {
        return (monto / cuotas) * this.getInteres();
    }

    protected abstract double getInteres();

    private boolean superaMontoCliente() {
        return calcularCuota() > cliente.getSueldo() + 0.30;
    }

    public void pagarCuota() {
        estado.pagarCuota(this);
    }
}
