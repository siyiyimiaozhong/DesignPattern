package com.siyi.singleton;

public class Instance06 {
    private static volatile Instance06 INSTANCE;

    private Instance06(){}

    public static Instance06 getInstance(){
        if(null == INSTANCE){
            synchronized (Instance06.class){
                if(null == INSTANCE){
                    INSTANCE = new Instance06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Instance06.getInstance().hashCode());
            }).start();
        }
    }
}
