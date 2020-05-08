package at.fhj.iit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class represents the test class to test our created subclass apple juice
 */

public class AppleJuiceTest {
    @Test
    void testFailsOnNoWater() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new AppleJuice(0, 1);
        });

    }

    @Test
    void testFailsOnNoConcetrate() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new AppleJuice(1, 0);
        });

    }

    @Test
    @DisplayName("Testing constructor appleJuice")
    public void testConstructorAppleJuice(){
        AppleJuice water = new AppleJuice (1.0, 0.0);
        AppleJuice appleJuice = new AppleJuice (2.0, 2.0);
        assertEquals(water.getVolume(), 1.0, 0.001);
        assertEquals(appleJuice.getVolume(), 2.0, 0.001);
        assertEquals(water.getAlcoholPercent(), 0.0, 0.001);
        assertFalse(water.isAlcoholic());
    }


}
