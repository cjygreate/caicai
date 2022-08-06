package com.cjy.test.dp.factory;

public class XiaoSuCigarette extends Cigarette{

    public XiaoSuCigarette(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    void smoke() {
        System.out.println("小苏虽然便宜，但是不好抽");
    }
}
