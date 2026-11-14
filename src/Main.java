import factory.BurgerFactory;
import factory.MealFactory;
import decorator.ExtraCheese;
import decorator.ExtraSauce;
import factory.PizzaFactory;
import strategy.StudentDiscount;
import strategy.RegularDiscount;
import observer.OrderPublisher;
import observer.CustomerNotifier;
import observer.KitchenNotifier;
import facade.RestaurantFacade;
import model.Customer;
import model.Meal;
import model.Order;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== RESTAURANT ORDERING SYSTEM ===");

        //factory create meal
        MealFactory pizzaFactory = new PizzaFactory();
        Meal meal = pizzaFactory.createMeal();

        //decorator add toppings
        meal = new ExtraCheese(meal);
        meal = new ExtraSauce(meal);

        //observer subscribe listeners
        OrderPublisher publisher = new OrderPublisher();
        publisher.subscribe(new CustomerNotifier());
        publisher.subscribe(new KitchenNotifier());

        //strategy choose discount algorithm
        StudentDiscount discount = new StudentDiscount();

        //facade simplify order processing
        //facade uses builder internally
        RestaurantFacade restaurant = new RestaurantFacade(
                discount, publisher);

        //builder used inside RestaurantFacade
        Customer customer = new Customer("Aiym");

        Order order = restaurant.placeOrder(customer, meal);

        //change status and notify observers
        restaurant.markReady(order);


        System.out.println("\n=== SECOND ORDER ===");

        //factory creates another meal
        MealFactory burgerFactory = new BurgerFactory();
        Meal burger = burgerFactory.createMeal();

        //strategy: no discount
        RestaurantFacade regularRestaurant = new RestaurantFacade(
                new RegularDiscount(), publisher);

        //builder and Facade create the order
        Order secondOrder = regularRestaurant.placeOrder(
                new Customer("Zhannur"), burger);

        //observer notifies subscribers
        regularRestaurant.markReady(secondOrder);

        System.out.println("=== ORDER COMPLETED ===");
    }
}
