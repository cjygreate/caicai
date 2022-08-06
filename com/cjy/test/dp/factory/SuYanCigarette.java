package com.cjy.test.dp.factory;

public class SuYanCigarette extends Cigarette{

    public SuYanCigarette(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void smoke() {
        System.out.printf("这款价值%s的%s抽起来口感还可以\n", price, brand);
    }
}
