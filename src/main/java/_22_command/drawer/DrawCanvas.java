package _22_command.drawer;

import _22_command.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.red;

    private final int radius = 6;

    private final MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        this.history = history;
        history.append(new ColorCommand(this, color));
    }

    public void paint(Graphics g) {
        history.execute();
    }


    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
