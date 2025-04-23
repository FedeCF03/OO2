package ar.edu.info.unlp.ejer11P2;

import java.util.List;

public class Mixta implements Topografia {
    private List<Topografia> topografias;

    @Override
    public double calcularProporcion() {
        double cantAgua = topografias.stream().mapToDouble(t -> t.calcularProporcion()).sum();
        return cantAgua / 4;
    }

    @Override
    public boolean comparar(Topografia otraTopografia) {
        boolean resultado = topografias.equals(otraTopografia);
        boolean resultado2 = this.calcularProporcion() == otraTopografia.calcularProporcion();

        return resultado && resultado2;
    }

    public Mixta(List<Topografia> topografias) {
        this.topografias = topografias;
    }

    public List<Topografia> getTopografias() {
        return topografias;
    }

}
