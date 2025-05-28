package ar.edu.info.unlp.Ejer22P2;

public class FakeMixingTank {

    private int temperature;
    private int mixerPower;
    private int volumen;

    public boolean heatPower(int percentage) {
        this.temperature = percentage;
        return true;
    }

    public boolean mixerPower(int percentage) {
        this.mixerPower = percentage;
        return true;
    }

    public int getMixerPower() {
        return this.mixerPower;
    }

    public boolean purge() throws InterruptedException {
        Thread.sleep(4000);
        if (this.temperature == 0 && this.mixerPower == 0) {
            this.volumen = 0;
            return true;
        }
        return false;

    }

    public double upTo() {
        return this.volumen;
    }

    public int temperature() {
        return this.temperature;
    }

}
