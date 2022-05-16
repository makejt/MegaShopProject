package by.itstep.makejt.megashopproject.model.entity.conteiner;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;

public class ListBasket {
    private Node first;
    private int size;

    public ListBasket() {
        size = 0;
        first = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Product product) {
        if (isEmpty()) {
            first = new Node(product);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(product);
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isEmpty()) {
            builder.append("Basket is empty");
        } else {
            builder.append("Basket: \n");
        }
        Node temp = first;
        while (temp.next != null) {
            builder.append("\n").append(temp.product);
            temp = temp.next;
        }
        builder.append("\n").append(temp.product);
        return builder.toString();
    }

    private class Node {
        public Product product;
        public Node next;

        public Node(Product product) {
            this.product = product;
        }
    }
}