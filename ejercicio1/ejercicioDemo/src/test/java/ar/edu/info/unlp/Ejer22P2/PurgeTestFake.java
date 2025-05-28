package ar.edu.info.unlp.Ejer22P2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PurgeTestFake {
    private FakeMixingTank tank;
    private ProcessStep purge;

    @BeforeEach
    public void setUp() {
        this.tank = new FakeMixingTank();
        this.purge = new Purge();
    }

    @Test
    public void testLightMixTrue() {

        this.purge.basicExecute(tank);
        assertEquals(5, this.tank.getMixerPower());
        assertEquals(20, this.tank.temperature());
        assertTrue(this.tank.purge());
    }
}
