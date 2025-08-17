package io.github.iviiincent._07_builder;

public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");

        builder.makeString("From morning to afternoon");
        builder.makeItem(new String[]{
                "good morning",
                "good afternoon"
        });

        builder.makeString("At night");
        builder.makeItem(new String[]{
                "good night",
                "well sleep",
                "goodbye"
        });
        builder.close();
    }
}
