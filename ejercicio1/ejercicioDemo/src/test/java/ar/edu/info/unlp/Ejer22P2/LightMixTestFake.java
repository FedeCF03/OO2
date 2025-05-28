package ar.edu.info.unlp.Ejer22P2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightMixTestFake {
    private FakeMixingTank tank;
    private ProcessStep lightMix;

    @BeforeEach
    public void setUp() {
        this.tank = new FakeMixingTank();
        this.lightMix = new LightMix();
    }

    @Test
    public void testLightMixTrue() {

        this.lightMix.basicExecute(tank);
        assertEquals(5, this.tank.getMixerPower());
        assertEquals(20, this.tank.temperature());

    }

}
