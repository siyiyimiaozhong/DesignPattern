package com.siyi.builderpattern;

public class ConcreteBuilder extends Builder {
    @Override
    public Builder buildPartA() {
        this.product.setPartA("建造 PartA");
        return this;
    }

    @Override
    public Builder buildPartB() {
        this.product.setPartB("建造 PartB");
        return this;
    }

    @Override
    public Builder buildPartC() {
        this.product.setPartC("建造 PartC");
        return this;
    }
}