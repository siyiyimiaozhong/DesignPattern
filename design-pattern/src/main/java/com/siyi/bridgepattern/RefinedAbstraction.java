package com.siyi.bridgepattern;

//扩展抽象化角色
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        impl.OperationImpl();
    }
}