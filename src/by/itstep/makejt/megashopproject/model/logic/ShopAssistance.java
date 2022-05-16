package by.itstep.makejt.megashopproject.model.logic;

import by.itstep.makejt.megashopproject.model.entity.conteiner.DynamicBasket;

public class ShopAssistance {

    private ShopAssistance(){

    }

    public static double calculateTotalPrice (DynamicBasket basket){
        double total = 0;

        for (int i = 0; i < basket.getCountOfProduct(); i++) {
            total += basket.getProduct(i).getPrice();
        }
        return total;
    }
}