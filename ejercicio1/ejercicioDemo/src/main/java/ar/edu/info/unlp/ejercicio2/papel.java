package ar.edu.info.unlp.ejercicio2;

public class papel {

    public papel() {
    }

    public boolean comparar(comparable j2) {
        if (j2 instanceof piedra) {
            return true;
        } else if (j2 instanceof tijera) {
            return false;
        } else {
            return true;
        }
    }
}
