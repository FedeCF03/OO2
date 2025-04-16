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
        estado.menos(this);
    };

    public void por() {
        estado.por(this);
    };

    public void dividido() {
        estado.dividido(this);
    };

    public void mas() {
        estado.mas(this);
    };

    public void setValor(Double valor) {
        if (!this.valorUnoIngresado) {
            this.valor1 = valor;
            this.valorUnoIngresado = true;
        } else {
            this.valor2 = valor;
        }

    };

    protected double calcularResultado() {
        return this.operacionStrategy.getResultado(this.valor1, this.valor2);
    };

    public void setOperacionStrategy(OperacionStrategy operacionStrategy) {
        this.operacionStrategy = operacionStrategy;
    };

    public void setEstado(Estado estado) {
        this.estado = estado;
    };

    public void borrarTodo() {
        this.setEstado(new EstadoEsperandoValor());
        valorUnoIngresado = false;
        this.valor1 = 0.0;
        this.valor2 = 0.0;
        this.setOperacionStrategy(null);
    }
}
