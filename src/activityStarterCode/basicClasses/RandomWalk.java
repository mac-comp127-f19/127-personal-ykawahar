package activityStarterCode.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int currentValue;

    /**
     * Creates a new random walk starting with some initial value.
     */
    public RandomWalk(int value) {
        rng = new Random();
        currentValue = value;
    }

    /**
     * @return the current value for the random walk.
     */
    public int getValue() {
        return currentValue;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * @return Updated value.
     */
    public int advanceValue() {
        if (rng.nextBoolean()) {
            currentValue += 1;
        } else {
            currentValue -= 1;
        }
        return getValue();
    }
}

