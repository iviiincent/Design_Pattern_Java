package _01_iterator;


import java.util.Iterator;

public interface Aggregate<T> {
    Iterator<T> iterator();
}
