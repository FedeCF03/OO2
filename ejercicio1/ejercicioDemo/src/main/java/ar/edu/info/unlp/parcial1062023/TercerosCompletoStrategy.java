package ar.edu.info.unlp.parcial1062023;

public class TercerosCompletoStrategy implements SeguroStrategy {

    @Override
    public Double calcularCostoSeguroVida(Seguro seguro) {

    }

    @Override
    public Double calcularCostoDeDanos(Seguro seguro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Double calcularCostoDestruccionTotal(Seguro seguro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
