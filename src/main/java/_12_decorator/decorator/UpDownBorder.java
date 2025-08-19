package _12_decorator.decorator;

import _12_decorator.Display;

public class UpDownBorder extends Border {

    private final char borderChar;

    public UpDownBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() - 1) {
            return String.valueOf(borderChar).repeat(getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }
}
