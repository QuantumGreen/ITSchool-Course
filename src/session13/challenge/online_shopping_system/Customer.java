package session13.challenge.online_shopping_system;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    public String name;
    public String email;
    public String shippingAddress;
    public String billingAddress;

    private List<Product> shoppingCartProducts;
    private List<Integer> shoppingCartQuantities;
    private List<Order> orders;

    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;

        shoppingCartProducts = new ArrayList<>();
        shoppingCartQuantities = new ArrayList<>();
        orders = new ArrayList<>();
    }

    // bug, if adding same product twice it should only change the quantity
    public void addProduct(Product product,int quantity) {
        shoppingCartProducts.add(product);
        // remove quantity from product
        product.quantity -= quantity;
        // add quantity to shoppingCart
        shoppingCartQuantities.add(quantity);
    }

    public boolean removeProduct(Product product) {
        for (int i = 0; i < shoppingCartProducts.size(); i++) {
            Product cartProduct = shoppingCartProducts.get(i);
            int cartQuantity = shoppingCartQuantities.get(i);
            if(cartProduct == product){
                product.quantity += cartQuantity;
                shoppingCartProducts.remove(i);
                shoppingCartQuantities.remove(i);
                return true;
            }
        }
        return false;
    }

    public Order placeOrder() {
        Order order = new Order(this,shoppingCartProducts,shoppingCartQuantities);
        orders.add(order);
        // empty shopping cart
        shoppingCartProducts = new ArrayList<>();
        shoppingCartQuantities = new ArrayList<>();
        return order;
    }

    public void viewOrderHistory(){
        System.out.println(orders);
    }

    public void trackOrderStatus(Order order){
        System.out.println(order.getStatus());
    }
}
