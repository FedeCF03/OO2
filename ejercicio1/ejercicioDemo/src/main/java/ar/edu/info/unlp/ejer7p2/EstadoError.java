package ar.edu.info.unlp.ejer7p2;

public class EstadoError implements Estado {

    @Override
    public double getResultado(Calculadora calculadora) {
        throw new IllegalStateException("Error: No se puede calcular el resultado en estado de error.");
    }

    @Override
    public void borrar(Calculadora calculadora) {
        calculadora.borrarTodo();

    }

    @Override
    public void setValor(double unValor, Calculadora calculadora) {
        // No se puede establecer un valor en estado de error
        throw new IllegalStateException("Error: No se puede establecer un valor en estado de error.");
    }

    @Override
    public void menos(Calculadora calculadora) {
        throw new IllegalStateException("Error: No se puede realizar una operación en estado de error.");
    }

    @Override
    public void por(Calculadora calculadora) {
        throw new IllegalStateException("Error: No se puede realizar una operación en estado de error.");
    }

    @Override
    public void dividido(Calculadora calculadora) {
        throw new IllegalStateException("Error: No se puede realizar una operación en estado de error.");
    }

    @Override
    public void mas(Calculadora calculadora) {
        throw new IllegalStateException("Error: No se puede realizar una operación en estado de error.");
    }

}
