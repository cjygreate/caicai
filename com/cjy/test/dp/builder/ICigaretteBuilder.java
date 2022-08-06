package com.cjy.test.dp.builder;

public interface ICigaretteBuilder {

    public CigaretteBuilder buildBrand(String brand);

    public CigaretteBuilder buildPrice(double price);

    public CigaretteBuilder buildColor(String color);

    public CigaretteBuilder buildFlavor(String flavor);

    public Cigarette buildCigarette();

}
