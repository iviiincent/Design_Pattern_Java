package _09_bridge.exercise;

import _09_bridge.DisplayImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {

    private static final int READ_AHEAD_LIMIT = 1024;

    private final String filename;

    private BufferedReader reader;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(READ_AHEAD_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=== " + filename + " ===");
    }

    @Override
    public void rawPrint() {
        try {
            reader.reset();
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("=== end ===");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
