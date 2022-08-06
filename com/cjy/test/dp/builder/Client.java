package com.cjy.test.dp.builder;
/**
 * 建造者模式
 */
public class Client {
    public static void main(String[] args) {
        Cigarette cigarette = new CigaretteBuilder().buildBrand("中华")
                .buildPrice(45)
                .buildColor("红色")
                .buildFlavor("还行")
                .buildCigarette();
        System.out.println(cigarette);
    }
}
