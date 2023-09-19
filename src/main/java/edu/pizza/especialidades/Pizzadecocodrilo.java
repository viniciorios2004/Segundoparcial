package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class Pizzadecocodrilo extends Pizza {
    private String cocodrilo;

    private double price = 40.00;

    public String getCocodrilo() {
        return cocodrilo;
    }

    public void setCocodrilo(String cocodrilo) {
        this.cocodrilo = cocodrilo;
    }

    public Pizzadecocodrilo(String name,  String cocodrilo, double price,  Topping... toppings) {
        super(name,  toppings);
        this.cocodrilo = cocodrilo;
        this.price = price;
    }



}
