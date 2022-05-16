package by.itstep.makejt.megashopproject.model.entity.conteiner;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;

public class DynamicBasket {

    private Product[] products;

    public DynamicBasket() {
        products = new Product[0];
    }

    public DynamicBasket(Product[] products) {
        this();
        if (products == null) {
            products = new Product[0];
        }
        this.products = products;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (products == null || (products.length == 0)) {
            builder.append("Basket is empty");
        } else {
            builder.append("Basket: \n");

            for (Product product : products) {
                builder.append("\n").append(product);
            }
        }
        return builder.toString();
    }

    public void add(Product product) {
        if (product == null) {
            return;
        }
        Product[] temp = new Product[products.length + 1];
        int i = 0;
        for (; i < products.length; i++) {
            temp[i] = products[i];
        }
        temp[i] = product;
        products = temp;
    }

    public void removeProduct(int index) {
        Product[] temp = new Product[products.length + 1];
        for (int i = 0, j = 0; i < products.length; i++) {
            if (i != index) {
                temp[j] = products[i];
                j++;
            }
            products = temp;
        }
    }

    public void setProducts (int index, Product product){
        products[index] = product;
    }

    public int getCountOfProduct() {
        return products.length;
    }

    public Product getProduct(int index) {
        return products[index];
    }
}
