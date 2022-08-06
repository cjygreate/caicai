package com.cjy.test.dp.strategy;

public class WaterStrategy implements Istrategy{
    @Override
    public void fightType() {
        System.out.println("水面作战需要航空母舰编队，与海岛渔民协同作战");
    }
}
