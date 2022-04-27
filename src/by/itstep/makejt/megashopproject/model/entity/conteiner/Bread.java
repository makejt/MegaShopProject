package by.itstep.makejt.megashopproject.model.entity.conteiner;

public class Bread {
    private String colour;
    private String flour;
    private double price;

    Bread (){

    }

    public Bread(String colour, String flour, double price) {
        this.colour = colour;
        this.flour = flour;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "colour='" + colour + '\'' +
                ", flour='" + flour + '\'' +
                ", price=" + price +
                '}';
    }






}
