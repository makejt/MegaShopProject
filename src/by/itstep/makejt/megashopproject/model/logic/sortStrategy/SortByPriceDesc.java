package by.itstep.makejt.megashopproject.model.logic.sortStrategy;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;

public class SortByPriceDesc implements Sortable {

    public boolean compare (Product pr1, Product pr2){
        return pr1.getPrice() < pr2.getPrice();
    }

}
