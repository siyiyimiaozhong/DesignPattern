package com.siyi.singleton;

/**
 * 静态內部类方式
 * jvm保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Instance07 {
    private Instance07(){}

    private static class Instance07Holder{
        private final static Instance07 INSTANCE = new Instance07();
    }

    public static Instance07 getInstance(){
        return Instance07Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Instance07.getInstance().hashCode());
            }).start();
        }
    }
}
