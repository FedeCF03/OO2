package ar.edu.info.unlp.ejer11P2;

public class Pantano implements Topografia {

    @Override
    public double calcularProporcion() {
        return 0.7;
    }

    @Override
    public boolean comparar(Topografia otraTopografia) {
        return otraTopografia instanceof Pantano;
    }

}
