package by.itstep.makejt.megashopproject.model.logic;

import by.itstep.makejt.megashopproject.model.entity.Milk;
import by.itstep.makejt.megashopproject.model.entity.Orange;
import by.itstep.makejt.megashopproject.model.entity.conteiner.DynamicBasket;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopAssistanceTest {

    @Test
    public void testCalculateTotalPrice(){

        Orange orange = new Orange(200, 3000, 4.5);
        Milk milk1 = new Milk(1000, 3.5, 2);
        Milk milk2 = new Milk(1000, 3.5, 2);
        Milk milk3 = new Milk(1000, 3.5, 2);

        DynamicBasket basket = new DynamicBasket();
        basket.add(orange);
        basket.add(milk1);
        basket.add(milk2);
        basket.add(milk3);

        double expected = 10.5;
        double actual = ShopAssistance.calculateTotalPrice(basket);
        assertEquals(expected, actual, 0.1);
    }




}
