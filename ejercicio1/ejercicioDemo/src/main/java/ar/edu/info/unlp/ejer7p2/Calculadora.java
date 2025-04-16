package ar.edu.info.unlp.ejer7p2;

public class Calculadora {
    private double valor1;
    private double valor2;
    private Estado estado;
    private OperacionStrategy operacionStrategy;
    private boolean valorUnoIngresado;

    public double getResultado() {
        return estado.getResultado(this);
    };

    public void borrar() {
        estado.borrar(this);
    };

    public void menos() {
    };

    public void por() {
    };

    public void dividido() {
    };

    public void mas() {
    };

    public void setValor(Double valor) {
        if (!this.valorUnoIngresado) {
            this.valor1 = valor;
            this.valorUnoIngresado = true;
        } else {
            this.valor2 = valor;
        }

    };

    private double calcularResultado() {
        return this.operacionStrategy.getResultado(this.valor1, this.valor2);
    };

    public void setOperacionStrategy(OperacionStrategy operacionStrategy) {
        this.operacionStrategy = operacionStrategy;
    };

    public void setEstado(Estado estado) {
        this.estado = estado;
    };
}
