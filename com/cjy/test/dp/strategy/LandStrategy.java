package com.cjy.test.dp.strategy;

public class LandStrategy implements Istrategy{
    @Override
    public void fightType() {
        System.out.println("地面作战需大规模火炮作为支撑，疏散地面群众。");
    }
}
