package com.cjy.test.dp.strategy;

import com.cjy.test.dp.factory.Cigarette;
import com.cjy.test.dp.factory.SuYanCigarette;

/**
 * 策略模式测试
 */
public class Client {
    public static void main(String[] args) {
        Istrategy landStrategy = new LandStrategy();
        Istrategy waterStrategy = new WaterStrategy();
        Istrategy skyStrategy = new SkyStrategy();
        FightType lanFight = new FightType(landStrategy);
        FightType waterFight = new FightType(waterStrategy);
        FightType skyFight = new FightType(skyStrategy);
        lanFight.fight();
        waterFight.fight();
        skyFight.fight();
    }
}
