package _12_decorator.decorator;

import _12_decorator.Display;

public abstract class Border extends Display {

    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
