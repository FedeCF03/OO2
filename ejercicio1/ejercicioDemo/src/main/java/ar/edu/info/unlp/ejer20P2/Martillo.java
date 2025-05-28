package ar.edu.info.unlp.ejer20P2;

public class Martillo implements Arma {
    @Override
    public int atacar(Armadura armadura) {
        if ("ArmaduraDeAcero".equals(armadura.getTipo())) {
            return 4;
        } else if ("ArmaduraDeCuero".equals(armadura.getTipo())) {
            return 4;
        } else if ("ArmaduraDeHierro".equals(armadura.getTipo())) {
            return 5;
        }
        return 0;
    }

}
