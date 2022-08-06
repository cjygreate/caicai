package com.cjy.test.dp.factory;

public class SuYanCigaretteFactory extends AbstractCigaretteFactory{

    //苏烟工厂默认生成大苏
    @Override
    public Cigarette createCigarette() {
        return new SuYanCigarette("苏烟", 45);
    }

    //苏烟工厂同时也生产小苏
    public Cigarette createXiaoSu() {
        return new XiaoSuCigarette("小苏", 22);
    }
}
