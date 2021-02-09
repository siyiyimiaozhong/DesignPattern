package com.siyi.singleton;

public class Instance02 {
    private static final Instance02 INSTANCE;

    static {
        INSTANCE = new Instance02();
    }

    private Instance02(){}

    private static Instance02 getInstance(){
        return INSTANCE;
    }
}
