package com.siyi.singleton;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class Instance03 {
    private static Instance03 INSTANCE;
    private Instance03(){
    }

    public static Instance03 getInstance(){
        if(null == INSTANCE){
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Instance03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Instance03.getInstance().hashCode());
            }).start();
        }
    }
}
