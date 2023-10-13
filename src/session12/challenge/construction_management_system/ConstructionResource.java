package session12.challenge.construction_management_system;

public class ConstructionResource {

    private String name;
    private double quantity;
    private double unitPrice;
    private double totalPrice;

    public ConstructionResource(String name, double quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = quantity * unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
        this.totalPrice = quantity*unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        this.totalPrice = quantity*unitPrice;
    }
}
