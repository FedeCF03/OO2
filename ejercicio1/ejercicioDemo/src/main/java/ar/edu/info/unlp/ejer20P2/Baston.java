package ar.edu.info.unlp.ejer20P2;

public class Baston implements Arma {

    @Override
    public int atacar(Armadura armadura) {
        if ("ArmaduraDeAcero".equals(armadura.getTipo())) {
            return 1;
        } else if ("ArmaduraDeCuero".equals(armadura.getTipo())) {
            return 2;
        } else if ("ArmaduraDeHierro".equals(armadura.getTipo())) {
            return 1;
        }
        return 0;
    }

}
