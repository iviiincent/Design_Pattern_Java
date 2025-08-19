package _11_composite;

import java.util.ArrayList;

public class Directory extends Entry {

    private final ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry e : directory) {
            size += e.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry e : directory) {
            e.printList(prefix + "/" + getName());
        }
    }
}
