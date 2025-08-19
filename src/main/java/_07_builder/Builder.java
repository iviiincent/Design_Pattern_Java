package _07_builder;

public abstract class Builder {

    private boolean initialized = false;

    private boolean built = false;

    public void makeTitle(String title) {
        if (!initialized && !built) {
            buildTitle(title);
            initialized = true;
        }
    }

    public void makeString(String str) {
        if (initialized && !built) {
            buildString(str);
        }
    }

    public void makeItem(String[] items) {
        if (initialized && !built) {
            buildItem(items);
        }
    }

    public void close() {
        if (initialized && !built) {
            buildDone();
            built = true;
        }
    }

    protected abstract void buildTitle(String title);

    protected abstract void buildString(String str);

    protected abstract void buildItem(String[] items);

    protected abstract void buildDone();
}
