package ar.edu.info.unlp.ejer2P2;

public class Pasante extends Empleado {
    private int cantExamenes;

    public Pasante(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    protected double calcularBasico() {
        return 20000;
    }

    @Override
    protected double calcularAdicional() {
        return cantExamenes * 2000;

    }

}
