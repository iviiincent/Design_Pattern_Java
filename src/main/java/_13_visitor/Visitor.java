package _13_visitor;

import _13_visitor.file_system.Directory;
import _13_visitor.file_system.File;

public abstract class Visitor {

    public abstract void visit(File file);

    public abstract void visit(Directory directory);

}
