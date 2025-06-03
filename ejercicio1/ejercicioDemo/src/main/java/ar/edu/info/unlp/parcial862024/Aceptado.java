package ar.edu.info.unlp.parcial862024;

public class Aceptado implements EstadoPrestamo {

    public Aceptado() {
    }

    @Override
    public void pagarCuota(Prestamo prestamo) {
        prestamo.registrarPago();
        if (prestamo.getCuotas() = 0) {

        }

    }

}
