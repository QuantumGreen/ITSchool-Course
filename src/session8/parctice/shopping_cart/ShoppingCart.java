package session8.parctice.shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;
    public ShoppingCart(){
        products = new ArrayList<>();
    }

    public void addProduct(Product p){
        System.out.println("Added the product: " + p.name);
        products.add(p);
    }
    public boolean remProduct(Product p){
        System.out.println("Removed the product: " + p.name);
        return products.remove(p);
    }
    public Product remProduct(int index){
        System.out.println("Removed the product: " + products.get(index).name);
        return products.remove(index);
    }
    public double totalPrice(){
        double sum = 0;
        for (Product p : products) {
            sum += p.price;
        }
        return sum;
    }
}
