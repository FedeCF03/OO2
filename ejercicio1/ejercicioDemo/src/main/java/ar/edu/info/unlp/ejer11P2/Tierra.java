package ar.edu.info.unlp.ejer11P2;

public class Tierra implements Topografia {

    @Override
    public double calcularProporcion() {
        return 0.0;
    }

    @Override
    public boolean comparar(Topografia otraTopografia) {
        return otraTopografia instanceof Tierra;
    }

}
