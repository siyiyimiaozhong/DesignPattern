package com.siyi.commandpattern;

public class Main {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        ir.call();
    }
}
