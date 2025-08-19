package _07_builder;

public class TextBuilder extends Builder {

    private final StringBuffer buffer = new StringBuffer();

    @Override
    public void buildTitle(String title) {
        buffer.append("===================\n")
                .append("[").append(title).append("]")
                .append("\n");
    }

    @Override
    public void buildString(String str) {
        buffer.append(" @ ").append(str).append("\n");
    }

    @Override
    public void buildItem(String[] items) {
        for (String item : items) {
            buffer.append("\t> ").append(item).append("\n");
        }
    }

    @Override
    public void buildDone() {
        buffer.append("===================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
