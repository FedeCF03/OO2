package ar.edu.info.unlp.ejer14P2;

import java.time.LocalDate;

public class Automovil implements Prenda {
    private LocalDate modelo;
    private int kilometraje;
    private double costo;
    private String marca;

    @Override
    public double valor() {

        return this.costo * (0.1 * (LocalDate.now().getYear() - this.modelo.getYear()));
    }

    @Override
    public double valorPrendario() {
        return this.valor() * 0.7;
    }
}