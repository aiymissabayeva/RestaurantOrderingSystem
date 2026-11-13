package model;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Meal> meals;
    private OrderStatus status;

    public Order(Customer customer, List<Meal> meals){
        this.customer = customer;
        this.meals = List.copyOf(meals);
        this.status = OrderStatus.CREATED;
    }


}
