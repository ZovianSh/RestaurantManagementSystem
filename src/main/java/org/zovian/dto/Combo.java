package org.zovian.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Combo {
    private static int nextId = 1;

    private String id;
    private String name;
    private double price;
    private Dish[] dishes;
    private Beverage[] beverages;

    public Combo(String name){
        this.id = String.format("C%03d", nextId++);
        this.name = name;
        this.dishes = new Dish[2];
        this.beverages = new Beverage[2];
    }

    public void addComdo(Combo combo){
        //if [0] = null beverage = beverage
        //else if [1] = null same
    }

    public void calcPrice(){
        double price = 0;
        for (dish dish : dishes) {
            
        }
    }

}
