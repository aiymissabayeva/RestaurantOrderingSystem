package observer;
import model.Order;

public class CustomerNotifier implements OrderObserver{
    @Override
    public void update(Order order) {
        System.out.println("Customer " + order.getCustomer().getName() + ": order status is " + order.getStatus());
    }
}
