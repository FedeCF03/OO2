package ar.edu.info.unlp.ejer20P2;

public class Thoor extends Personaje {
    public Thoor(String nombre) {
        super(nombre, new Martillo(), new ArmaduraDeHierro());
    }

    @Override
    public void atacar(Personaje enemigo) {
        if (this.getVida() > 0) {
            super.atacar(enemigo);
        }
    }

}
