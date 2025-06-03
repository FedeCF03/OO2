package ar.edu.info.unlp.parcial1062023;

import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    private List<Seguro> seguros;
    private Promocion promocion;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double calcularCostoTotalSeguros() {
        double costoTotal = seguros.stream()
                .mapToDouble(Seguro::calcularCostoTotal)
                .sum();

        return costoTotal - promocion.calcularBonificacion(this);
    }

}
