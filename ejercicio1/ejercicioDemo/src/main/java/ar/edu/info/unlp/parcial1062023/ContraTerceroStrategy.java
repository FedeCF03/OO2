package ar.edu.info.unlp.parcial1062023;

public class ContraTerceroStrategy implements SeguroStrategy {

    @Override
    public Double calcularCostoSeguroVida(Seguro seguro) {
        return 100.0 * seguro.getPersona().getEdad();
    }

    @Override
    public Double calcularCostoDeDanos(Seguro seguro) {
        return seguro.getVehiculo().getValor() * 0.01 * 1000.0;
    }

    @Override
    public Double calcularCostoDestruccionTotal(Seguro seguro) {
        return seguro.getVehiculo().getValor() * 0.05;
    }

}
