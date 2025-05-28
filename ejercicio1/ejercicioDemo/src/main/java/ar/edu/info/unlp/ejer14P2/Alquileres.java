package ar.edu.info.unlp.ejer14P2;

import java.time.LocalDate;
import java.time.Period;

public class Alquileres implements Prenda {
    private LocalDate Comienzo;
    private LocalDate Fin;
    private double Costo;

    @Override
    public double valor() {
        return this.Costo * (Period.between(Comienzo, Fin).getDays() / 30.0);
    }

    @Override
    public double valorPrendario() {
        return this.valor() * 0.9;
    }

}
