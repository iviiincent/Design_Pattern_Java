package _07_builder;

public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildTitle("Greeting");

        builder.buildString("From morning to afternoon");
        builder.buildItem(new String[]{
                "good morning",
                "good afternoon"
        });

        builder.buildString("At night");
        builder.buildItem(new String[]{
                "good night",
                "well sleep",
                "goodbye"
        });
        builder.buildDone();
    }
}
