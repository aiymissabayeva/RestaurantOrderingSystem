package facade;

import builder.OrderBuilder;
import model.Customer;
import model.Meal;
import model.Order;
import model.OrderStatus;
import observer.OrderPublisher;
import strategy.DiscountStrategy;

public class RestaurantFacade {
    private final DiscountStrategy discount;
    private final OrderPublisher publisher;

    public RestaurantFacade(
            DiscountStrategy discount,
            OrderPublisher publisher) {
        this.discount = discount;
        this.publisher = publisher;
    }

    public Order placeOrder(Customer customer, Meal meal) {
        Order order = new OrderBuilder()
                .setCustomer(customer)
                .addMeal(meal)
                .build();

        System.out.println("Order created for " + customer.getName());
        System.out.println("Meal: " + meal.getName());
        System.out.println("Original price: "
                + order.getTotalPrice() + " KZT");
        System.out.println("Final price: "
                + discount.applyDiscount(order.getTotalPrice())
                + " KZT");

        publisher.changeStatus(order, OrderStatus.PREPARING);

        return order;
    }

    public void markReady(Order order) {
        publisher.changeStatus(order, OrderStatus.READY);
    }
}
