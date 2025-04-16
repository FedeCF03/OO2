package ar.edu.info.unlp.ejer7p2;

public interface Estado {
    public double getResultado(Calculadora calculadora);

    public void borrar(Calculadora calculadora);

    public void setValor(double unValor, Calculadora calculadora);

    public void menos(Calculadora calculadora);

    public void por(Calculadora calculadora);

    public void dividido(Calculadora calculadora);

    public void mas(Calculadora calculadora);
}
