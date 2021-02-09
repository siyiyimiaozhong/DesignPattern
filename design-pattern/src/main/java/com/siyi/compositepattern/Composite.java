package com.siyi.compositepattern;

import java.util.ArrayList;

//树枝构件
public class Composite implements Component {
    String name;
    ArrayList<Component> children = new ArrayList<Component>();

    public Composite(String name){
        this.name = name;
    }

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        System.out.println(name);
    }
}