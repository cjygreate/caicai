package com.cjy.test.dp.factory;

public class ZhongHuaCigaretteFactory extends AbstractCigaretteFactory{
    @Override
    public Cigarette createCigarette() {
        return new ZhongHuaCigarette("中华", 45);
    }

    //中华工厂同时也生成软中
    public Cigarette createSoft() {
        //TODO
        return null;
    }

}
