package ar.edu.info.unlp.ejer2P2;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    protected int hijos;

    protected boolean casado;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public double sueldo() {
        double basico = calcularBasico();
        double adicional = calcularAdicional();
        return calcularDescuento(basico, adicional);

    }

    protected abstract double calcularBasico();

    protected abstract double calcularAdicional();

    protected double calcularDescuento(double basico, double adicional) {
        return basico - (0.13 * basico) + (0.05 * adicional);
    }
}
