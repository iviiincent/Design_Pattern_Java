package _22_command.drawer;

import _22_command.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {

    private final Color color = Color.red;

    private final MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        this.history = history;
    }

    public void paint(Graphics g) {
        history.execute();
    }


    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        int radius = 6;
        graphics.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
