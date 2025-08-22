package _20_flyweight;

import java.util.HashMap;

public class BigCharFactory {

    private final static BigCharFactory singleton = new BigCharFactory();

    private final HashMap<Character, BigChar> pool = new HashMap<>();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bigChar = pool.getOrDefault(charname, null);
        if (bigChar == null) {
            bigChar = new BigChar(charname);
            pool.put(charname, bigChar);
        }
        return bigChar;
    }

}
