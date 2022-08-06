package com.cjy.test.dp.builder;

public class CigaretteBuilder implements ICigaretteBuilder{

    Cigarette cigarette = new Cigarette();

    @Override
    public CigaretteBuilder buildBrand(String brand) {
        cigarette.setBrand(brand);
        return this;
    }

    @Override
    public CigaretteBuilder buildPrice(double price) {
        cigarette.setPrice(price);
        return this;
    }

    @Override
    public CigaretteBuilder buildColor(String color) {
        cigarette.setColor(color);
        return this;
    }

    @Override
    public CigaretteBuilder buildFlavor(String flavor) {
        cigarette.setFlavor(flavor);
        return this;
    }

    @Override
    public Cigarette buildCigarette() {
        return cigarette;
    }
}
