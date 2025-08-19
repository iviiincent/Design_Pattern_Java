package _15_facade.pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {

    private Database() {
    }

    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
