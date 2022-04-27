package by.itstep.makejt.megashopproject.model.entity.conteiner;

import by.itstep.makejt.megashopproject.model.entity.Milk;
import by.itstep.makejt.megashopproject.model.entity.Orange;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Arrays;


public class Basket {



    private Orange []oranges;
    private Milk [] milks;

    public Basket(){
        oranges = new Orange[0];
        milks = new Milk[0];
    }

    public Basket(Orange [] oranges, Milk [] milks){
        this ();

        if (oranges == null){
            oranges = new Orange[0];
        }
        if (milks == null){
            milks = new Milk[0];
        }

        this.oranges = oranges;
        this.milks = milks;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (oranges == null || milks == null
                || (milks.length == 0 && oranges.length == 0)){
            builder.append("Basket is empty");
        } else {
            builder.append("Basket: \n");

            for (Orange orange : oranges){
                builder.append("\n").append(orange);
            }

            for (Milk milk : milks){
                builder.append("\n").append(milk);
            }




        }

        return builder.toString();
    }




    public void add (Orange orange){

        if (orange == null){
            return;
        }

        Orange [] temp = new Orange[oranges.length + 1];
        int i = 0;
        for (; i < oranges.length; i++) {
            temp [i] = oranges [i];
        }

        temp [i] = orange;
        oranges = temp;
    }


    public void removeOrange (int index){
        Orange [] temp = new Orange[oranges.length + 1];

        for (int i = 0, j = 0; i < oranges.length; i++) {
            if (i != index){
                temp [j] = oranges[i];
                j++;
            }

            oranges = temp;
        }


    }


    public void add (Milk milk){
        Milk [] temp = new Milk[milks.length + 1];
        int i = 0;
        for (; i < milks.length; i++) {
            temp [i] = milks[i];
        }

        temp [i] = milk;
        milks = temp;


    }


    public void removeMilk (int index) {
        Milk[] temp = new Milk[milks.length + 1];

        for (int i = 0, j = 0; i < milks.length; i++) {
            if (i != index) {
                temp[j] = milks[i];
                j++;
            }

            milks = temp;
        }


    }

    public int getCountOfOrange(){
        return oranges.length;
    }

    public int getCountOfMilk(){
        return milks.length;
    }

    public Orange getOrange (int index){
        return oranges[index];
    }


    public Milk getMilk (int index){
        return milks[index];
    }




}
