package entities;

public class Product {

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

  

}