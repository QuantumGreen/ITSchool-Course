package session13.challenge.online_shopping_system;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Billbo", "billibob@mail.com", "Istanbul", "Constantinople");
        Product product1 = new Product("fish", "it's smelly", 99.99, 10000);
        Product product2 = new Product("Batman lunchbox", "classy", 8999.99, 10);

        System.out.println(product1);
        System.out.println(product2);

        customer.addProduct(product1, 100);
        customer.addProduct(product2, 1);

        System.out.println(product1);
        System.out.println(product2);

        Order order = customer.placeOrder();

        System.out.println("order total: " + order.calculateTotalAmount());

        System.out.println(order.getStatus());
        order.updateStatus(OrderStatus.ON_ROAD);
        System.out.println(order.getStatus());
        order.updateStatus(OrderStatus.DELIVERED);
        System.out.println(order.getStatus());
        System.out.println("customer is happy");
    }
}
