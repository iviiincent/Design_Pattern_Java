package _15_facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {

    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddress, String filename) {
        Properties mailProperties = Database.getProperties("maildata");
        String username = mailProperties.getProperty(mailAddress);
        try (
                HtmlWriter writer = new HtmlWriter(new FileWriter(filename))
        ) {
            writer.title("Welcome to " + username + "'s page.");
            writer.paragraph("Good day " + username + ",");
            writer.paragraph("We're waiting for your email.");
            writer.mailto(mailAddress, username);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
