package _13_visitor.file_system;

import _13_visitor.visitor.Visitor;

public interface Element {

    void accept(Visitor visitor);

}
