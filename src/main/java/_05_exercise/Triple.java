package _05_exercise;

public class Triple {

    private static final Triple[] triples = new Triple[]{
            new Triple(0), new Triple(1), new Triple(2)
    };

    private final int id;

    private Triple(int id) {
        System.out.println("Creating Triple instance " + id);
        this.id = id;
    }

    public static Triple getInstance(int id) {
        if (id < 0 || id >= 3) {
            throw new IllegalArgumentException("0 <= id <= 2 is expected.");
        }
        return triples[id];
    }

    public int getId() {
        return id;
    }
}
