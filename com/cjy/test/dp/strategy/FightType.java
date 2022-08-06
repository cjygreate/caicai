package com.cjy.test.dp.strategy;

public class FightType {

    private Istrategy istrategy;

    public FightType(Istrategy istrategy) {
        this.istrategy = istrategy;
    }

    public void fight(){
        istrategy.fightType();
    }
}
