package ar.edu.info.unlp.parcial1062023;

public interface SeguroStrategy {
    public Double calcularCostoSeguroVida(Seguro seguro);

    public Double calcularCostoDeDanos(Seguro seguro);

    public Double calcularCostoDestruccionTotal(Seguro seguro);

}
