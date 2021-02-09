package com.siyi.visitorpattern;

public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}