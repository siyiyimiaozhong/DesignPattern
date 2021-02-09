package com.siyi.proxypattern;

//代理
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        preRequest();
        subject.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("before...");
    }

    public void postRequest() {
        System.out.println("after...");
    }
}