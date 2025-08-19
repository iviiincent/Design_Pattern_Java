package _13_visitor;

import _13_visitor.file_system.Directory;
import _13_visitor.file_system.Entry;
import _13_visitor.file_system.File;

import java.util.Iterator;

public class FileFindVisitor extends Visitor {

    private final String suffix;

    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix)) {
            System.out.println(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
    }
}
