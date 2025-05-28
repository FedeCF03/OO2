package ar.edu.info.unlp.Ejer22P2;

public class Purge extends ProcessStep {

    @Override
    protected boolean basicExecute(FakeMixingTank tank) {
        return tank.mixerPower(5) && tank.heatPower(20) && tank.purge();

    }

}
