package com.siyi.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类加载时就完成实例化
 */
public class Instance01 {
    private static final Instance01 INSTANCE = new Instance01();

    private Instance01(){}

    public static Instance01 getInstance(){
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args){
        Instance01 i1 = Instance01.getInstance();
        Instance01 i2 = Instance01.getInstance();
        System.out.println(i1==i2);
    }
}
