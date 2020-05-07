package at.fhj.iit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
