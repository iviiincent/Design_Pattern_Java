package io.github.iviiincent._07_builder;

public class Main {

    public static void main(String[] args) {
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println("filename " + filename);
        } else {
            System.exit(0);
        }
    }
}
