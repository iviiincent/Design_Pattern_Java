package io.github.iviiincent._08_abstract_factory.listfactory;

import io.github.iviiincent._08_abstract_factory.factory.Item;
import io.github.iviiincent._08_abstract_factory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("<li>\n")
                .append(caption).append("\n")
                .append("<ul>\n");

        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n")
                .append("</li>\n");

        return buffer.toString();
    }
}
