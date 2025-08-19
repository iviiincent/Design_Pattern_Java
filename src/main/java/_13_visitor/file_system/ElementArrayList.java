package _13_visitor.file_system;

import _13_visitor.visitor.Visitor;

import java.util.ArrayList;

public class ElementArrayList extends ArrayList<Entry> implements Element {

    @Override
    public void accept(Visitor visitor) {
        for (Entry entry : this) {
            entry.accept(visitor);
        }
    }

}
