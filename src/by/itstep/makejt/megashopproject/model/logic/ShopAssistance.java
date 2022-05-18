package by.itstep.makejt.megashopproject.model.logic;

import by.itstep.makejt.megashopproject.model.entity.conteiner.DynamicBasket;
import by.itstep.makejt.megashopproject.model.entity.iteratorpattern.MyIterator;

public class ShopAssistance {

    private ShopAssistance(){

    }

    public static double calculateTotalPrice (MyIterator iterator){
        double total = 0;

        while (iterator.hasNext()){
            total += iterator.next().getPrice();
        }

        return total;
    }
}