package com.siyi.observerpattern;

//具体观察者1
public class ConcreteObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("具体观察者2作出修改！");
    }
}