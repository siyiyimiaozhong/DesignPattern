package com.siyi.mediatorpattern;

public class Main {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1 = new ConcreteColleague1();
        Colleague c2 = new ConcreteColleague2();
        //注册同事信息
        md.register(c1);
        md.register(c2);
        //发送消息
        c1.send();
        c2.send();
    }
}
