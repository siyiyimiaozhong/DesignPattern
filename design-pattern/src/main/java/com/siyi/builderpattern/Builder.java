package com.siyi.builderpattern;

public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract Builder buildPartA();

    public abstract Builder buildPartB();

    public abstract Builder buildPartC();
    //返回产品对象
    public Product build() {
        return product;
    }
}