package ar.edu.info.unlp.ejer7p2;

public class SumaStrategy implements OperacionStrategy {

    @Override
    public double getResultado(double valor1, double valor2) {
        return valor1 + valor2;
    }

}
