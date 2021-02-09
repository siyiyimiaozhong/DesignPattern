package com.siyi.compositepattern;

//树叶构件
public class Leaf implements Component {
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name);
    }
}
