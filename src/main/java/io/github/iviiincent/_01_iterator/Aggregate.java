package io.github.iviiincent._01_iterator;


import java.util.Iterator;

public interface Aggregate<T> {
    Iterator<T> iterator();
}
