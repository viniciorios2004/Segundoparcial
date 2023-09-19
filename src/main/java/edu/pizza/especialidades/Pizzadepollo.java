package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class Pizzadepollo extends Pizza {
    private String pollo;

    public Pizzadepollo(String pizzaDePollo, double v) {
        super();
    }

    public String getpollo() {
        return pollo;
    }

    public void setpollo(String pollo) {
        this.pollo = pollo;
    }

    public Pizzadepollo(String name, String pollo, Topping... toppings) {
        super(name, toppings);
        this.pollo = pollo;
    }
}