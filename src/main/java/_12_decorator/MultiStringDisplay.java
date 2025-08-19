package _12_decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    private final List<String> strings = new ArrayList<>();

    private int maxWidth;

    public void add(String string) {
        strings.add(string);
        updateMaxWidth();
    }

    @Override
    public int getColumns() {
        return strings.size();
    }

    @Override
    public int getRows() {
        return maxWidth;
    }

    @Override
    public String getRowText(int row) {
        String s = strings.get(row);
        return s + " ".repeat(maxWidth - s.length());
    }

    private void updateMaxWidth() {
        int result = 0;
        for (String s : strings) {
            result = Math.max(result, s.length());
        }
        this.maxWidth = result;
    }
}