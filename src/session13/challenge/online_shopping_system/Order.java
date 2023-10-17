package session13.challenge.online_shopping_system;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Order {

    private static final AtomicLong ORDER_NUM = new AtomicLong();
    private long orderNumber;
    private Customer customer;
    private List<Product> products;
    private List<Integer> quantities;
    private OrderStatus status;

    public Order(Customer customer, List<Product> products, List<Integer> quantities) {
        this.orderNumber = ORDER_NUM.getAndIncrement();
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.status = OrderStatus.IN_STORAGE;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public double calculateTotalAmount() {
        double sum = 0;
        for (int i = 0; i < products.size(); i++) {
            double price = products.get(i).price;
            int quantity = quantities.get(i);
            sum += price * quantity;
        }
        return sum;
    }

    public void updateStatus(OrderStatus newStatus){
        status = newStatus;
    }

    public OrderStatus getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer=" + customer +
                ", products=" + products +
                ", quantities=" + quantities +
                ", status=" + status +
                '}';
    }
}
