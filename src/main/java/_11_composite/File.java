package _11_composite;

import lombok.Getter;
import lombok.Setter;

public class File extends Entry {

    @Getter
    @Setter
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
