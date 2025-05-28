package ar.edu.info.unlp.ejer20P2;

public abstract class Personaje {
    private String nombre;
    private Arma arma;
    private Armadura armadura;
    private int vida;

    public Personaje(String nombre, Arma arma, Armadura armadura) {
        this.nombre = nombre;
        this.arma = arma;
        this.armadura = armadura;
        this.vida = 100;
    }

    public void atacar(Personaje enemigo) {
        Armadura armaduraEnemigo = enemigo.getArmadura();
        if (enemigo.getVida() > 0) {
            enemigo.recibirDano(arma.atacar(armaduraEnemigo));
        }
    }

    public void recibirDano(int dano) {
        this.vida -= dano;
    }

    public int getVida() {
        return vida;
    }

    public Armadura getArmadura() {
        return armadura;
    }
}
