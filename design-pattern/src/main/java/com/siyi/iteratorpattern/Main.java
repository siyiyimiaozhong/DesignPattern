package com.siyi.iteratorpattern;

public class Main {
    public static void main(String[] args) {
        Aggregate<String> list = new ConcreteAggregate<>();
        for(int i=0; i<15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        Iterator<String> it = list.getIterator();
        while(it.hasNext()) {
            String o = it.next();
            System.out.println(o);
        }
    }
}
