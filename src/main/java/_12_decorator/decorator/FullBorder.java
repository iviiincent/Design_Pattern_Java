package _12_decorator.decorator;

import _12_decorator.Display;

public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 2 + display.getColumns();
    }

    @Override
    public int getRows() {
        return 2 + display.getRows();
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() - 1) {
            return "|" + "-".repeat(display.getColumns()) + "|";

        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

}
