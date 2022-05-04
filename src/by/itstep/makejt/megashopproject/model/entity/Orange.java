package by.itstep.makejt.megashopproject.model.entity;

import by.itstep.makejt.megashopproject.model.entity.abstracts.Product;

public class Orange extends Product {

    private int diameter;
    private int vitaminC;

    public Orange() {

    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }



    @Override
    public String toString() {
        return "Orange{" +
                "diameter=" + diameter +
                ", vitaminC=" + vitaminC + ", " + super.toString() +
                '}';
    }

    public Orange(int diameter, int vitaminC, double price) {
        super(price);
        this.diameter = diameter;
        this.vitaminC = vitaminC;


    }
}
