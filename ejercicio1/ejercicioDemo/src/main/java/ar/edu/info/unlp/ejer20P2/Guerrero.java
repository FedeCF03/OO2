package ar.edu.info.unlp.ejer20P2;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre, new Espada(), new ArmaduraDeHierro());
    }

}
