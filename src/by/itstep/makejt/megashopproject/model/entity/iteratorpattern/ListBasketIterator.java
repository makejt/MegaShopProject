package by.itstep.makejt.megashopproject.model.entity.iteratorpattern;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;
import by.itstep.makejt.megashopproject.model.entity.conteiner.ListBasket;


public class ListBasketIterator implements MyIterator{

    private ListBasket basket;
    private int current;

    public ListBasketIterator(ListBasket basket) {
        this.basket = basket;
        current = 0;
    }

    @Override
    public Product next() {
        return basket.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current < basket.size();
    }

    @Override
    public void reset() {
        current = 0;
    }
}
