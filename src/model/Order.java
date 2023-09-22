package model;

import controller.FruitLogistics;

public class Order {

    private int id;
    private int quantity;
    private Fruit product;
    FruitLogistics manager = new FruitLogistics();

    public Order(int id, int quantity, Fruit product) {
        this.id= id;
        this.quantity = quantity;
        product.setRemainFruit(quantity);
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Fruit getProduct() {
        return product;
    }

    public void setProduct(Fruit product) {
        this.product = product;
    }

    public double calAmount() {
        return product.getPrice()*quantity;
    }



    public FruitLogistics getManager() {
        return manager;
    }

    public void setManager(FruitLogistics manager) {
        this.manager = manager;
    }

 
    @Override
    public String toString() {
        return id + ". " + product.getName() + "\t" + quantity + "\t" + product.getPrice() + "$\t" + calAmount() + "$\t";
    }

}
