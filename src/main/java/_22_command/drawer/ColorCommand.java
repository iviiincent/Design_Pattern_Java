package _22_command.drawer;

import _22_command.command.Command;

import java.awt.*;

public class ColorCommand implements Command {

    protected Drawable drawable;

    private final Color color;

    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
