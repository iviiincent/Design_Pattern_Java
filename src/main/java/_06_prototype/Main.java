package _06_prototype;

import _06_prototype.framework.Manager;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        String s = "Hello world!";
        String strongMessage = "strong message";
        String warningBox = "warning box";
        String slashBox = "slash box";

        manager.register(strongMessage, new UnderlinePen('~'));
        manager.register(warningBox, new MessageBox('*'));
        manager.register(slashBox, new MessageBox('/'));

        manager.create(strongMessage).use(s);
        manager.create(warningBox).use(s);
        manager.create(slashBox).use(s);
    }
}
