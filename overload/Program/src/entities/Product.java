package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // construct
    public Product(String name, double price, int quantity) {
        this.name = name;// referência ao atributo do objeto
        this.price = price;
        this.quantity = quantity;
    }
    
    //overload
    public Product(String name, double price) {
        this.name = name;// referência ao atributo do objeto
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}