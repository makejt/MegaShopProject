package by.itstep.makejt.megashopproject.model.logic.sortStrategy;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;

public interface Sortable {

     boolean compare (Product pr1, Product pr2);
}
