package _20_flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {

    private final String fontdata;

    public BigChar(char charname) {
        StringBuffer buffer = new StringBuffer();

        try (
                BufferedReader reader = new BufferedReader(new FileReader("./statics/big" + charname + ".txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.fontdata = buffer.toString();
    }

    public void print() {
        System.out.println(fontdata);
    }
}
