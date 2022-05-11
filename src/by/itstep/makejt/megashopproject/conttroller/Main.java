package by.itstep.makejt.megashopproject.conttroller;

import by.itstep.makejt.megashopproject.model.entity.Milk;
import by.itstep.makejt.megashopproject.model.entity.Orange;
import by.itstep.makejt.megashopproject.model.entity.conteiner.Basket;
import by.itstep.makejt.megashopproject.model.entity.conteiner.Bread;
import by.itstep.makejt.megashopproject.model.logic.Sorter;
import by.itstep.makejt.megashopproject.model.logic.sortStrategy.SortByPriceAsc;
import by.itstep.makejt.megashopproject.model.logic.sortStrategy.SortByPriceDesc;

public class Main {

    public static void main(String[] args) {

        Orange orange = new Orange(200, 3000, 4.3);
        System.out.println(orange);

        Milk milk1 = new Milk(950, 3.2, 2.7);
        Milk milk2 = new Milk(1000, 3.5, 2.9);
        Milk milk3 = new Milk(1000, 2.8, 2.5);

        System.out.println(milk1);
        System.out.println(milk2);
        System.out.println(milk3);

        Basket basket = new Basket();
        basket.add(orange);
        basket.add(milk1);
        basket.add(milk2);
        basket.add(milk3);

        Bread bread = new Bread("White", "Best", 1.9);
        Sorter.sort(basket, new SortByPriceDesc());
        System.out.println(basket);

        Sorter.sort(basket, new SortByPriceAsc());
        System.out.println(basket);
    }
}