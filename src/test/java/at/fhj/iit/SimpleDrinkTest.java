package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("Testing SimpleDrink implementation")
public class SimpleDrinkTest {

    @Test
    @DisplayName("Testing constructor non alcoholic")
    public void testConstructorCola(){
        SimpleDrink cola = new SimpleDrink("Cola", new Liquid("Cola", 0.25, 0));
        assertEquals(cola.getVolume(), 0.25, 0.001);
        assertEquals(cola.getAlcoholPercent(), 0, 0.001);
        assertFalse(cola.isAlcoholic());
    }

}
