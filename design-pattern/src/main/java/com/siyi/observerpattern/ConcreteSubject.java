package com.siyi.observerpattern;

public class ConcreteSubject extends Subject {

    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        for (Observer obs : observers) {
            obs.update();
        }
    }
}