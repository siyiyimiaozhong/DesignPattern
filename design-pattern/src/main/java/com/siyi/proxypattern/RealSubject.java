package com.siyi.proxypattern;

//真实主题
public class RealSubject implements Subject {
    public void request() {
        System.out.println("request...");
    }
}