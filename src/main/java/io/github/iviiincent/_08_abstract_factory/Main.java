package io.github.iviiincent._08_abstract_factory;

import io.github.iviiincent._08_abstract_factory.factory.Factory;
import io.github.iviiincent._08_abstract_factory.factory.Link;
import io.github.iviiincent._08_abstract_factory.factory.Page;
import io.github.iviiincent._08_abstract_factory.factory.Tray;

public class Main {

    public static void main(String[] args) {
        Factory factory = Factory.getFactory("io.github.iviiincent._08_abstract_factory.listfactory.ListFactory");

        Link google = factory.createLink("google", "https://www.google.com");
        Link bing = factory.createLink("bing", "https://www.bing.com");
        Link github = factory.createLink("github", "https://www.github.com");
        Link docker = factory.createLink("docker", "https://www.docker.com");

        Tray searchTray = factory.createTray("Search engine");
        searchTray.add(google);
        searchTray.add(bing);

        Tray devTray = factory.createTray("Developer tools");
        devTray.add(github);
        devTray.add(docker);

        Page page = factory.createPage("Homepage", "safari");
        page.add(searchTray);
        page.add(devTray);
        page.output();
    }

}
