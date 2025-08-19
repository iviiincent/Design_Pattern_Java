package _13_visitor.file_system;


import java.util.Iterator;

public abstract class Entry implements Element {

    private String name;

    public Entry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException("Invalid Entry.add()");
    }

    public Iterator<Entry> iterator() throws FileTreatmentException {
        throw new FileTreatmentException("Invalid Entry.iterator()");
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
