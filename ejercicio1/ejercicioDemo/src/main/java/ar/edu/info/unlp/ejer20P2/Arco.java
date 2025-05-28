package ar.edu.info.unlp.ejer20P2;

public class Arco implements Arma {

    @Override
    public int atacar(Armadura armadura) {
        if ("ArmaduraDeAcero".equals(armadura.getTipo())) {
            return 2;
        } else if ("ArmaduraDeCuero".equals(armadura.getTipo())) {
            return 5;
        } else if ("ArmaduraDeHierro".equals(armadura.getTipo())) {
            return 3;
        }
        return 0;
    }

}
