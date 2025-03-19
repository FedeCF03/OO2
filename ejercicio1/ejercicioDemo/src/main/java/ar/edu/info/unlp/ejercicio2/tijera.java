package ar.edu.info.unlp.ejercicio2;

public class tijera implements comparable {

    public tijera() {
    }

    public boolean comparar(comparable j2) {
        if (j2 instanceof piedra) {
            return false;
        } else if (j2 instanceof papel) {
            return true;
        } else {
            return true;
        }
    }

}
