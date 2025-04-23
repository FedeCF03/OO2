package ar.edu.info.unlp.ejer9P2;

import java.time.LocalDate;

public class Reserva {
    private Integer cantidadDeDias;
    private LocalDate fecha;
    private Usuario conductor;
    private AutoEnAlquiler autoEnAlquiler;

    public double montoAPagar() {

        return this.autoEnAlquiler.getPrecioPorDia() * this.cantidadDeDias;

    }

    public double montoAReembolsar() {

    }

}
