package com.siyi.prototypepattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Location siyi = new Location(new StringBuilder("siyi"), 23);
        Realizetype obj1 = new Realizetype(siyi);
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println(obj1 == obj2);
        System.out.println(obj1.location == obj2.location);
        System.out.println(obj1.location.street == obj2.location.street);
    }
}
