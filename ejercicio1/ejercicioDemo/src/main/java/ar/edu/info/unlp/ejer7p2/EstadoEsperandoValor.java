package ar.edu.info.unlp.ejer7p2;

public class EstadoEsperandoValor implements Estado {

    @Override
    public double getResultado(Calculadora calculadora) {
        throw new IllegalStateException("Error: No se puede establecer un valor .");
    }

    @Override
    public void borrar(Calculadora calculadora) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValor(double unValor, Calculadora calculadora) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void menos(Calculadora calculadora) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void por(Calculadora calculadora) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void dividido(Calculadora calculadora) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mas(Calculadora calculadora) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
