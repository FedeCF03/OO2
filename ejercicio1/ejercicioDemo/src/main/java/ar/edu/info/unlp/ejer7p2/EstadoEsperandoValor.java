package ar.edu.info.unlp.ejer7p2;

public class EstadoEsperandoValor implements Estado {

    @Override
    public double getResultado(Calculadora calculadora) {
        calculadora.setEstado(new EstadoError());
        throw new IllegalStateException("Error: No se puede calcular el resultado .");
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
        calculadora.setEstado(new EstadoError());
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void por(Calculadora calculadora) {
        calculadora.setEstado(new EstadoError());
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void dividido(Calculadora calculadora) {
        calculadora.setEstado(new EstadoError());
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mas(Calculadora calculadora) {
        calculadora.setEstado(new EstadoError());
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
