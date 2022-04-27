package by.itstep.makejt.megashopproject.conttroller;

import by.itstep.makejt.megashopproject.model.entity.Milk;
import by.itstep.makejt.megashopproject.model.entity.Orange;
import by.itstep.makejt.megashopproject.model.entity.conteiner.Basket;
import by.itstep.makejt.megashopproject.model.entity.conteiner.Bread;

public class Main {

    public static void main(String[] args) {

        Orange orange = new Orange(200, 3000, 4.5);
        System.out.println(orange);


        Milk milk1 = new Milk(1000, 3.5, 2.5);
        Milk milk2 = new Milk(1000, 3.5, 2.5);
        Milk milk3 = new Milk(1000, 3.5, 2.5);

        System.out.println(milk1);

        Basket basket = new Basket();
        basket.add(orange);
        basket.add(milk1);
        basket.add(milk2);
        basket.add(milk3);

        Bread bread = new Bread("White", "Best", 2.5);




    }





}


