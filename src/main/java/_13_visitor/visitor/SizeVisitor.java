package _13_visitor.visitor;

import _13_visitor.file_system.Directory;
import _13_visitor.file_system.Entry;
import _13_visitor.file_system.File;

import java.util.Iterator;

public class SizeVisitor extends Visitor {

    private int size = 0;

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
    }

    public int getSize() {
        return size;
    }
}
