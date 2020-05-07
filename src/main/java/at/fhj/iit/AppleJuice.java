package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class AppleJuice extends Drink {
    private List<Liquid> liquids;

    public AppleJuice(double waterVolume, double concentrateVolume) {
        super("Apple Juice");

        checkVolume("Water", waterVolume);
        checkVolume("Apple concentrate", concentrateVolume);

        liquids = new ArrayList<>();
        liquids.add(new Liquid("Water", waterVolume, 0));
        liquids.add(new Liquid("Apple concentrate", concentrateVolume, 0));
    }

    private void checkVolume(String name, double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("liquid " + name + " must have a volume > 0");
        }
    }

    @Override
    public double getVolume() {
        double totalVolume = 0;
        for (Liquid liquid : liquids) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
