package io.github.iviiincent._09_bridge.exercise;

import io.github.iviiincent._09_bridge.CountDisplay;
import io.github.iviiincent._09_bridge.DisplayImpl;

public class IncreaseDisplay extends CountDisplay {

    private final int step;

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int level) {
        for (int i = 0, curr = 0; i < level; i++) {
            multiDisplay(curr);
            curr += step;
        }
    }
}
