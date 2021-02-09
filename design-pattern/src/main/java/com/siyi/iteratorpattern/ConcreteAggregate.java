package com.siyi.iteratorpattern;

public class ConcreteAggregate<E> implements Aggregate<E> {
    E[] objects = (E[])new Object[10];
    private int index = 0;

    public void add(E o) {
        if(index == objects.length) {
            E[] newObjects = (E[])new Object[objects.length*2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index ++;
    }

    public int size() {
        return index;
    }

    @Override
    public Iterator<E> getIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator<E> implements Iterator<E> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if(currentIndex >= index) return false;
            return true;
        }

        @Override
        public E next() {
            E o = (E)objects[currentIndex];
            currentIndex ++;
            return o;
        }
    }
}