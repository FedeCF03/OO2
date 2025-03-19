package ar.edu.info.unlp.ejercicio2;

public class piedra {
    public piedra() {
    }

    public boolean comparar(comparable j2) {
        if (j2 instanceof tijera) {
            return true;
        } else if (j2 instanceof papel) {
            return false;
        } else {
            return true;
        }
    }

}
