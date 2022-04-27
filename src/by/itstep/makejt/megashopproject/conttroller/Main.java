package by.itstep.makejt.megashopproject.conttroller;

import by.itstep.makejt.megashopproject.model.entity.Milk;
import by.itstep.makejt.megashopproject.model.entity.Orange;
import by.itstep.makejt.megashopproject.model.entity.conteiner.Basket;

public class Main {

    public static void main(String[] args) {

        Orange orange = new Orange(200, 3000, 4.5);
        System.out.println(orange);


        Milk milk = new Milk(1000, 3.5, 2.5);
        System.out.println(milk);

        Basket basket = new Basket();
        basket.add(orange);
        basket.add(milk);


    }





}


