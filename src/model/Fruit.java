package model;

public class Fruit {
    private String name;
    private double price;
    private int quantity;
    private String origin;

    public Fruit(String name, double price, int quantity, String origin) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setRemainFruit(int n) {
        this.quantity = this.quantity - n;
    }
    
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return   "\t" + name + "\t" + origin + "\t" + price + "\t" + quantity;
    }
    
    
}
