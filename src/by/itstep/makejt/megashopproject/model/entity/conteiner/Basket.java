package by.itstep.makejt.megashopproject.model.entity.conteiner;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;

public interface Basket {

    int size ();
    Product get (int index);

}
