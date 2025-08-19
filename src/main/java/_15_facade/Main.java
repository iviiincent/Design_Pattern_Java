package _15_facade;

import _15_facade.pagemaker.PageMaker;

public class Main {

    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
        PageMaker.makeLinkPage("Link.html");
    }

}
