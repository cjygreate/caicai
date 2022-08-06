package com.cjy.test.dp.strategy;

public class SkyStrategy implements Istrategy{
    @Override
    public void fightType() {
        System.out.println("空中作战需要战略轰炸机作为活力支援，配合战斗机奇袭敌军后方补给线。");
    }
}
