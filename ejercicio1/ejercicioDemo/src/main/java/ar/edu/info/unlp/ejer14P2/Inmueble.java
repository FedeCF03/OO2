package ar.edu.info.unlp.ejer14P2;

public class Inmueble implements Prenda {
    private String dirección;
    private double superficie;
    private double costo;

    @Override
    public double valor() {
        return superficie * costo;
    }

    @Override
    public double valorPrendario() {
        return this.valor() * 0.2;
    }
}
