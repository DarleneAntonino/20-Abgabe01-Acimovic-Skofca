package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

/**
 * Class represents subclass Drinks/SimpleDrinks to learn how to
 * handle testcases
 */
public class AppleJuice extends Drink {
    private List<Liquid> liquids;

    /**
     * Creates a AppleJuice object with given water and
     * concentrate volume
     *
     * @param waterVolume       volume of water part
     * @param concentrateVolume volume of apple juice concentrate part
     */

    public AppleJuice(double waterVolume, double concentrateVolume) {
        super("Apple Juice");

        checkVolume("Water", waterVolume);
        checkVolume("Apple concentrate", concentrateVolume);
        liquids = new ArrayList<>();
        liquids.add(new Liquid("Water", waterVolume, 0));
        liquids.add(new Liquid("Apple concentrate", concentrateVolume, 0));
    }

    /**
     * Checks the volume and throws an Illegal Argument Exception if there is no
     * volume -> Exception method for excersise
     *
     * @param name   liquid
     * @param volume volume of apple juice/water
     */

    private void checkVolume(String name, double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("liquid " + name + " must have a volume > 0");
        }
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */

    @Override
    public double getVolume() {
        double totalVolume = 0;
        for (Liquid liquid : liquids) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
