package com.cjy.test.dp.factory;

public class ZhongHuaCigarette extends Cigarette{

    public ZhongHuaCigarette(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    void smoke() {
        System.out.printf("这款价值%s的%s抽起来口感还可以\n", price, brand);
    }
}
