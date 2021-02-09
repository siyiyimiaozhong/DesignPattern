package com.siyi.facadepattern;

public class Facade {
    private Obj1 obj1;
    private Obj2 obj2;
    private Obj3 obj3;

    public Facade(){
        this.obj1 = new Obj1();
        this.obj2 = new Obj2();
        this.obj3 = new Obj3();
    }

    public void method(){
        this.obj1.SubSystem01();
        this.obj2.SubSystem02();
        this.obj3.SubSystem03();
    }
}
