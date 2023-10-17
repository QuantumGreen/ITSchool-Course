package session13.challenge.online_shopping_system;

public class Product {
    public String name;
    public String description;
    public double price;
    public int quantity;

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public void addQuantity(int offset){
        quantity += offset;
    }
    public void removeQuantity(int offset){
        quantity -= offset;
    }

    public boolean isInStock(){
        return quantity > 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
