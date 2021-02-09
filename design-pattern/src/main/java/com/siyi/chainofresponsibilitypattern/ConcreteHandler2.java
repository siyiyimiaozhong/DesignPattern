package com.siyi.chainofresponsibilitypattern;

//具体处理者角色2
public class ConcreteHandler2 extends Handler {
    public void handleRequest(String request) {
        if (check(request)) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }

    private boolean check(String request) {
        if(request.length()>=5) return true;
        return false;
    }
}