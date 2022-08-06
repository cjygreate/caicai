package com.cjy.test.dp.factory;

/**
 * 抽象工厂模式
 */
public class Client {

    public static void main(String[] args) {
        SuYanCigaretteFactory suYanCigaretteFactory = new SuYanCigaretteFactory();
        Cigarette suyan = suYanCigaretteFactory.createCigarette();
        suyan.smoke();
        ZhongHuaCigaretteFactory zhongHuaCigaretteFactory = new ZhongHuaCigaretteFactory();
        Cigarette zhonghua = zhongHuaCigaretteFactory.createCigarette();
        zhonghua.smoke();
        Cigarette xiaoSu = suYanCigaretteFactory.createXiaoSu();
        xiaoSu.smoke();
    }

}
