package io.github.iviiincent._09_bridge.exercise;

import io.github.iviiincent._09_bridge.CountDisplay;
import io.github.iviiincent._09_bridge.DisplayImpl;

import java.util.Random;

public class RandomDisplay extends CountDisplay {
    Random random = new Random();

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times + 1));
    }
    
}
