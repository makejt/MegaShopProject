package by.itstep.makejt.megashopproject.model.entity.iteratorpattern;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;

public interface MyIterator {

    Product next();
    boolean hasNext();
    void reset ();



}
