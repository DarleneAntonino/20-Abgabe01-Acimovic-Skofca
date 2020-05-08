package at.fhj.iit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class represents the test class to test our created subclass apple juice
 */

public class AppleJuiceTest {

   // private Liquid water, appleJuice;

   /* *//**
     * inits nonalcoholic liquid for EACH test
     *//*
    @BeforeEach
    void setup() {
        // SETUP PHASE
        water = new Liquid("water", 0.3, 0.0);
        appleJuice = new Liquid("apple juice", 0.125, 0.0);
    }


    @Test
    @DisplayName("Testing constructor water")
    public void testConstructorWater(){
        assertEquals(water.getName(), "water");
        assertEquals(water.getVolume(), 0.3, 0.001);
        assertEquals(water.getAlcoholPercent(), 0.0, 0.001);
    }

    @Test
    @DisplayName("Testing constructor apple juice")
    public void testConstructorAppleJuice(){

        assertEquals(appleJuice.getName(), "apple juice");
        assertEquals(appleJuice.getVolume(), 0.125, 0.001);
        assertEquals(appleJuice.getAlcoholPercent(), 0, 0.001);
    }


    @Test
    @DisplayName("Testing alcoholPercent setters")
    public void testAlcoholPercentSetter(){
        AppleJuice water = new AppleJuice(0.0, 0.2);
        water.setAlcoholPercent(0.0);
        assertEquals(water.getAlcoholPercent(), 0.0, 0.001);
    }*/

    /**
     * tests for the exception using water and concetrate seperatly
     */

    @Test
    @DisplayName("Testing exception with water")
    void testFailsOnNoWater() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new AppleJuice(0, 1);
        });

    }

    @Test
    @DisplayName("Testing exception with concentrate")
    void testFailsOnNoConcetrate() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new AppleJuice(1, 0);
        });

    }

    /**
     * tests for the constructor for apple juice mix
     */

    @Test
    @DisplayName("Testing constructor appleJuice")
    public void testConstructorAppleJuice2(){

        AppleJuice appleJuice = new AppleJuice (8.0, 2.0);

        assertEquals(appleJuice.getVolume(), 10.0, 0.001);
        assertEquals(appleJuice.getAlcoholPercent(), 0.0, 0.001);
        assertFalse(appleJuice.isAlcoholic());
    }


}
