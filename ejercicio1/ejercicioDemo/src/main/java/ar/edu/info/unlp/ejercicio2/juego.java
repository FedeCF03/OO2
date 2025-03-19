package ar.edu.info.unlp.ejercicio2;

public class juego {

    public juego() {
    }

    public void jugar(comparable j1, comparable j2) {
        boolean res1 = j1.comparar(j2);
        boolean res2 = j2.comparar(j1);
        if (res1 && res2) {
            System.out.println("Empate");
        } else if (res1) {
            System.out.println("Gana jugador 1");
        } else {
            System.out.println("Gana jugador 2");
        }
    }

}
