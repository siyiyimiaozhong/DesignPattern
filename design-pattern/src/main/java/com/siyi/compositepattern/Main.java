package com.siyi.compositepattern;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Composite c = new Composite("c");
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        root.add(c);
        root.add(leaf1);
        c.add(leaf2);
        c.add(leaf3);
        tree(root,0);
    }

    public static void tree(Component c, int depth) {
        for(int i=0; i<depth; i++) System.out.print("--");
        c.operation();
        if(c instanceof Composite) {
            for (Component n : ((Composite)c).children) {
                tree(n, depth + 1);
            }
        }
    }
}
