package com.siyi.bridgepattern;

public class Main {
    public static void main(String[] args) {
        Implementor impl = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(impl);
        abs.Operation();
    }
}
