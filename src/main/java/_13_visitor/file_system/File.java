package _13_visitor.file_system;

import _13_visitor.visitor.Visitor;

public class File extends Entry {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}