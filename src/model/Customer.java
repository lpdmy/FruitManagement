package model;

import java.util.ArrayList;

public class Customer {
    private int id;
    private String name;
    ArrayList<Order> orderList = new ArrayList<>();

    public Customer(int id, String name, ArrayList<Order> orderList) {
        this.id = id;
        this.name = name;
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    
    public void addOrder(Order e) {
        orderList.add(e);
    }
    
    public double total() {
        double sum = 0;
        for (Order order : orderList) {
            sum = sum + order.calAmount();
        }
        return sum;
    }
    
    public void display() {
        System.out.println("Customer: "+ name);
        System.out.println("Product\t|Quantity\t|Price\t|Amount\t");
        for (Order order : orderList) {
            if (order.getQuantity()>0) System.out.println(order);
        }
        System.out.println("Total: "+total());
    }
}
