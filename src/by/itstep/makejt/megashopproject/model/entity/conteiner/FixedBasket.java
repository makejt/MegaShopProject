package by.itstep.makejt.megashopproject.model.entity.conteiner;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;

public class FixedBasket implements Basket{

    public static final int DEFAULTSIZE = 10;
    private int size;
    private Product[] array;

    public FixedBasket() {
        array = new Product[DEFAULTSIZE];
        size = 0;
    }

    public FixedBasket(int capacity) {
        array = new Product[capacity];
        size = 0;
    }

    public FixedBasket(Product[] array) {
        this.array = array;
        size = array.length;
    }

    public Product get(int index) {
        return array[index];
    }

    public void setProducts(int index, Product product) {
        array[index] = product;
    }


    public int size() {
        return size;
    }

    public int capacity() {
        return array.length;
    }


    public void add(Product product) {
        if (product == null) {
            return;
        }

        if (size < array.length) {
            array[size] = product;
            size++;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void removeProduct(int index) {

        if (isEmpty() || index < 0 && index >= size) {
            return;
        }

        if (index == size - 1) {
            array[index] = null;
        } else {

            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (isEmpty()) {
            builder.append("Basket is empty");
        } else {
            builder.append("Basket: \n");
        }

        for (int i = 0; i < size; i++) {
            builder.append("\n").append(array);
        }


        return builder.toString();
    }
}
