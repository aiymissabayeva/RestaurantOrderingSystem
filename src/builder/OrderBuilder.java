package builder;

import java.util.ArrayList;
import java.util.List;
import model.Customer;
import model.Meal;
import model.Order;

public class OrderBuilder {
    private Customer customer;
    private final List<Meal> meals = new ArrayList<>();

    public OrderBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder addMeal(Meal meal) {
        meals.add(meal);
        return this;
    }

    public Order build() {
        if (customer == null || meals.isEmpty()) {
            throw new IllegalStateException(
                    "Customer and meal are required"
            );
        }

        return new Order(customer, meals);
    }
}
