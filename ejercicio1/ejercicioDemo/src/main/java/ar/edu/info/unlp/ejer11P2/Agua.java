package ar.edu.info.unlp.ejer11P2;

public class Agua implements Topografia {

    @Override
    public double calcularProporcion() {
        return 1.0;
    }

    @Override
    public boolean comparar(Topografia otraTopografia) {
        return otraTopografia instanceof Agua;
    }

}
