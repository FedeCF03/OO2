package ar.edu.info.unlp.ejer7p2;

public class EstadoEsperandoOperando implements Estado {

    @Override
    public double getResultado(Calculadora calculadora) {
        return calculadora.calcularResultado();
    }

    @Override
    public void borrar(Calculadora calculadora) {
        calculadora.borrarTodo();
    }

    @Override
    public void setValor(double unValor, Calculadora calculadora) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void menos(Calculadora calculadora) {
        calculadora.setOperacionStrategy(new RestaStrategy());
        calculadora.setEstado(new EstadoEsperandoValor());
    }

    @Override
    public void por(Calculadora calculadora) {
        calculadora.setOperacionStrategy(new PorStrategy());
        calculadora.setEstado(new EstadoEsperandoValor());
    }

    @Override
    public void dividido(Calculadora calculadora) {
        calculadora.setOperacionStrategy(new DividirStrategy());
        calculadora.setEstado(new EstadoEsperandoValor());
    }

    @Override
    public void mas(Calculadora calculadora) {
        calculadora.setOperacionStrategy(new SumaStrategy());
        calculadora.setEstado(new EstadoEsperandoValor());
    }

}
