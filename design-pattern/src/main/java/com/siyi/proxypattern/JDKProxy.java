package com.siyi.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        Subject1 subject = new ConcreteSubject();
        //保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        /**
         * Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
         * loader: 指定类加载器，一般和被代理对象使用相同的类加载器。
         * interfaces: 生成的代理对象需要实现的接口。
         * h: 调用时处理器对象，实现其invoke方法来进行方法增强。
         * return: 返回代理后的对象
         */
        Subject1 s = (Subject1) Proxy.newProxyInstance(ConcreteSubject.class.getClassLoader(),
                new Class[]{Subject1.class},
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 代理生成的对象，一般情况用不到，当然有时可以通过proxy来调用其他被代理的方法
                     * @param method 正在执行的方法对象
                     * @param args 执行方法所传入的参数
                     * @return 执行成功后一般返回null
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Before...");
                        Object o = method.invoke(subject, args);
                        System.out.println("after...");
                        return o;
                    }
                });
        s.fun();
    }
}

interface Subject1{
    void fun();
}

class ConcreteSubject implements Subject1{
    @Override
    public void fun() {
        System.out.println("fun...");
    }
}