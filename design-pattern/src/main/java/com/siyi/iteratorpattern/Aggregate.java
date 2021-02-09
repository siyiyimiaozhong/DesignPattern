package com.siyi.iteratorpattern;

public interface Aggregate<E> {
    void add(E o);
    int size();

    Iterator getIterator();
}