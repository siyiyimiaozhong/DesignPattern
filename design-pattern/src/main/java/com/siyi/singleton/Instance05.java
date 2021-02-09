package com.siyi.singleton;

public class Instance05 {
    private static Instance05 INSTANCE;
    private Instance05(){}

    public static Instance05 getInstance(){
        if (null == INSTANCE){
            synchronized (Instance05.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Instance05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Instance05.getInstance().hashCode());
            }).start();
        }
    }
}
