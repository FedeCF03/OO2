package ar.edu.info.unlp.ejer2P2;

public class Planta extends Empleado {
    private int antiguedad;

    public Planta(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    protected double calcularBasico() {
        return 50000;
    }

    @Override
    protected double calcularAdicional() {
        double adicional = 0;
        if (this.casado)
            adicional += 5000;
        adicional += this.hijos + 2000;
        adicional += antiguedad * 2000;
        return adicional;
    }

}
