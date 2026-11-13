package observer;
import java.util.ArrayList;
import java.util.List;
import model.Order;
import model.OrderStatus;

public class OrderPublisher {
    private final List<OrderObserver> observers = new ArrayList<>();

    public void subscribe(OrderObserver observer){
        observers.add(observer);
    }

    public void unsubscribe(OrderObserver observer) {
        observers.remove(observer);
    }

    public void changeStatus(Order order, OrderStatus status) {
        order.setStatus(status);

        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }
}
