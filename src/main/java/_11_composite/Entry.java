package _11_composite;

import lombok.Getter;

public abstract class Entry {

    @Getter
    private String name;

    protected Entry parent;

    public Entry(String name) {
        this.name = name;
    }

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    public String getPath() {
        StringBuffer buffer = new StringBuffer();
        Entry entry = parent;
        while (entry != null) {
            buffer.insert(0, "/" + entry.getName());
            entry = entry.parent;
        }
        buffer.append("/").append(this.getName());
        return buffer.toString();
    }

    protected abstract void printList(String prefix);


    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
