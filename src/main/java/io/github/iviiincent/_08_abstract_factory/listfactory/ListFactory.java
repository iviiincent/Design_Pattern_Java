package io.github.iviiincent._08_abstract_factory.listfactory;

import io.github.iviiincent._08_abstract_factory.factory.Factory;
import io.github.iviiincent._08_abstract_factory.factory.Link;
import io.github.iviiincent._08_abstract_factory.factory.Page;
import io.github.iviiincent._08_abstract_factory.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
