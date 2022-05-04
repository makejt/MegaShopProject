package by.itstep.makejt.megashopproject.model.entity.conteiner;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;

public class Bread extends Product {
    private String colour;
    private String flour;

    Bread() {

    }

    public Bread(String colour, String flour, double price) {
        super(price);
        this.colour = colour;
        this.flour = flour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }


    @Override
    public String toString() {
        return "Bread{" +
                "colour='" + colour +
                ", flour='" + flour + ", " + super.toString() + "}";
    }

}
