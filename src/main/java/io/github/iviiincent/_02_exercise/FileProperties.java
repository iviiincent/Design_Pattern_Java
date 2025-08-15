package io.github.iviiincent._02_exercise;

import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {
    
    Properties properties = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(filename);
        properties.load(inputStream);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(filename);
        properties.store(outputStream, "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key, "");
    }
}
