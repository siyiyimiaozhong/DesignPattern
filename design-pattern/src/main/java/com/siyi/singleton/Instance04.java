package com.siyi.singleton;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但是也带来效率下降的问题
 */
public class Instance04 {
    private static Instance04 INSTANCE;
    private Instance04(){}

    public static synchronized Instance04 getInstance(){
        if(null == INSTANCE){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Instance04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Instance04.getInstance().hashCode());
            }).start();
        }
    }
}
