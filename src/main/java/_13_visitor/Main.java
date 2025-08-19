package _13_visitor;


import _13_visitor.file_system.Directory;
import _13_visitor.file_system.File;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("> Making root directory");
            Directory root = new Directory("root");
            Directory bin = new Directory("bin");
            Directory tmp = new Directory("tmp");
            Directory usr = new Directory("usr");
            root.add(bin);
            root.add(tmp);
            root.add(usr);
            bin.add(new File("vi", 10000));
            bin.add(new File("latex", 20000));
            root.accept(new ListVisitor());

            System.out.println("> Making user entries");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usr.add(yuki);
            usr.add(hanako);
            usr.add(tomura);
            yuki.add(new File("diary.html", 100));
            File composite = new File("Composite.java", 200);
            yuki.add(composite);
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            root.accept(new ListVisitor());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
