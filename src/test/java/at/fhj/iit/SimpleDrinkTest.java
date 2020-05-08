package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class represents the test class to test the simple drink class
 */

@DisplayName("Testing SimpleDrink implementation")
public class SimpleDrinkTest {

    /**
     * tests the constructor with a simple drink like cola
     */

    @Test
    @DisplayName("Testing constructor non alcoholic")
    public void testConstructorCola(){
        SimpleDrink cola = new SimpleDrink("Cola", new Liquid("Cola", 0.25, 0));
        assertEquals(cola.getVolume(), 0.25, 0.001);
        assertEquals(cola.getAlcoholPercent(), 0, 0.001);
        assertFalse(cola.isAlcoholic());
    }

    /**
     * tests the constructor with a simple drink like vine to test the alcoholic part
     */

    @Test
    @DisplayName("Testing constructor alcoholic")
    public void testConstructorVine(){
        SimpleDrink vine = new SimpleDrink("Vine", new Liquid("Vine", 0.25, 8));
        assertEquals(vine.getVolume(), 0.25, 0.001);
        assertEquals(vine.getAlcoholPercent(), 8, 0.001);
        assertTrue(vine.isAlcoholic());
    }

}
