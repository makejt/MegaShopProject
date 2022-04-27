package by.itstep.makejt.megashopproject.model.logic;

import by.itstep.makejt.megashopproject.model.entity.conteiner.Basket;

public class ShopAssistance {

    private ShopAssistance(){}

    public static double calculateTotalPrice (Basket basket){
        double total = 0;

        for (int i = 0; i < basket.getCountOfOrange(); i++) {
            total += basket.getOrange(i).getCost();
        }

        for (int i = 0; i < basket.getCountOfMilk(); i++) {
            total += basket.getMilk(i).getMoney();
        }

        return total;

    }



}
