package ar.edu.info.unlp.ejer2P2;

public class Temporario extends Empleado {

    private double horasTrabajadas;
    private double valorHora = 300;

    public Temporario(String nombre, String apellido, double horasTrabajadas, double valorHora) {
        super(nombre, apellido);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    protected double calcularBasico() {
        return 20000 + this.horasTrabajadas * this.valorHora;
    }

    @Override
    protected double calcularAdicional() {
        double adicional = 0;
        if (this.casado)
            adicional += 5000;
        adicional += this.hijos + 2000;
        return adicional;
    }

}
