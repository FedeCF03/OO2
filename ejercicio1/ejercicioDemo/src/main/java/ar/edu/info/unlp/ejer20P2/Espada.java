package ar.edu.info.unlp.ejer20P2;

public class Espada implements Arma {

    @Override
    public int atacar(Armadura armadura) {
        if ("ArmaduraDeAcero".equals(armadura.getTipo())) {
            return 3;
        } else if ("ArmaduraDeCuero".equals(armadura.getTipo())) {
            return 8;
        } else if ("ArmaduraDeHierro".equals(armadura.getTipo())) {
            return 5;
        }
        return 0;
    }

}
