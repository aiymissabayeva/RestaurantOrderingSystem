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

    public Customer getCustomer(){
        return customer;
    }

    public List<Meal> getMeals(){
        return meals;
    }

    public OrderStatus getStatus(){
        return status;
    }

    public void setStatus(OrderStatus status){
        this.status =status;
    }

    public double getTotalPrice(){
        double total = 0;

        for (Meal meal : meals){
            total += meal.getPrice();
        }
        return total;
    }
}
