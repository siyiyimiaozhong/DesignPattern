package com.siyi.bridgepattern;

//抽象化角色
public abstract class Abstraction {
    protected Implementor impl;

    protected Abstraction(Implementor impl) {
        this.impl = impl;
    }

    public abstract void Operation();
}