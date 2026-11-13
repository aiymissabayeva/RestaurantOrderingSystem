package observer;
import model.Order;

public class KitchenNotifier implements OrderObserver{
    @Override
    public void update(Order order) {
        System.out.println("Kitchen: order status is " + order.getStatus());
    }
}
