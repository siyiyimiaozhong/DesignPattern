package com.siyi.flyweightpattern;

//非享元角色
public class UnsharedConcreteFlyweight {
    private String info;

    UnsharedConcreteFlyweight(String name) {
        this.info = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}