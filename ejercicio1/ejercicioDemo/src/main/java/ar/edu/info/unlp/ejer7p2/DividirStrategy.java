package ar.edu.info.unlp.ejer7p2;

public class DividirStrategy implements OperacionStrategy {

    @Override
    public double getResultado(double valor1, double valor2) {
        if (valor2 == 0) {
            return 0;
        }
        return valor1 / valor2;
    }

}
