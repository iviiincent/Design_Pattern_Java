package io.github.iviiincent.exercise_02;

public class Main {

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("new_file.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
