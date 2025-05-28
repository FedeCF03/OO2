package ar.edu.info.unlp.Ejer22P2;

public class LightMix extends ProcessStep {

    @Override
    protected boolean basicExecute(FakeMixingTank tank) {
        double tempInicial = tank.temperature();
        tank.heatPower(100);

        simulateDelay(2); // simula 2 segundos

        double tempFinal = tank.temperature();
        if (tempFinal - tempInicial == 10) {
            tank.mixerPower(5);
            return true;
        } else {
            return false;
        }
    }

}
