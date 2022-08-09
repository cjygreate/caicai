package com.cjy.test.dp.prototype;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("多利", 2, "白色", new Sheep("小利", 1, "黑色", null));
        Sheep clone = (Sheep) sheep.clone();
        System.out.println(System.identityHashCode(sheep));
        System.out.println(System.identityHashCode(clone));
        System.out.println(sheep == clone);
        System.out.println(sheep.getFriend() == clone.getFriend());
        System.out.println(sheep);
        System.out.println(clone);
        Sheep sheep1 = sheep.cloneSheep();
        System.out.println(sheep1.getFriend() == sheep.getFriend());
        System.out.println(sheep1 == sheep);
    }
}
