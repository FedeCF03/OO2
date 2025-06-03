package ar.edu.info.unlp.parcial1062023;

public class Seguro {
    public SeguroStrategy strategy;
    private Vehiculo vehiculo;
    private Persona persona;

    public Seguro(Vehiculo vehiculo, Persona persona, SeguroStrategy strategy) {
        this.vehiculo = vehiculo;
        this.persona = persona;
        this.strategy = strategy;
    }

    private Double calcularCostoSeguroVida() {
        return this.strategy.calcularCostoSeguroVida(this);
    }

    private Double calcularCostoDeDanos() {
        return this.strategy.calcularCostoDeDanos(this);
    }

    private Double calcularCostoDestruccionTotal() {
        return this.strategy.calcularCostoDestruccionTotal(this);
    }

    public Double calcularCostoTotal() {
        return this.calcularCostoSeguroVida() + this.calcularCostoDeDanos() + this.calcularCostoDestruccionTotal();
    }

    public Persona getPersona() {
        return persona;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

}
