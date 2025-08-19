package _08_abstract_factory.listfactory;

import _08_abstract_factory.factory.Item;
import _08_abstract_factory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("<html><head><title>").append(title).append("</title></head>\n")
                .append("<body>\n")
                .append("<h1>").append(title).append("</h1>\n")
                .append("<ul>\n");

        for (Item item : content) {
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n")
                .append("<hr><address>").append(author).append("</address>")
                .append("</body></html>\n");

        return buffer.toString();
    }
}
