package by.itstep.makejt.megashopproject.model.logic;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;
import by.itstep.makejt.megashopproject.model.entity.conteiner.DynamicBasket;
import by.itstep.makejt.megashopproject.model.logic.sortStrategy.Sortable;

public class Sorter {

    public static void sort(DynamicBasket basket, Sortable sortable) {
        for (int i = 0; i < basket.size() - 1; i++) {
            for (int j = 0; j < basket.size() - 1 - i; j++) {
                if (sortable.compare(basket.get(j), basket.get(j + 1))) {
                    Product temp = basket.get(j);
                    basket.setProducts(j, basket.get(j + 1));
                    basket.setProducts(j + 1, temp);
                }
            }
        }
    }

}




