package model;

import java.util.ArrayList;

public class CustomerList {
    ArrayList<Customer> list = new ArrayList<>();
    
    public void addCustomer(Customer a) {
        list.add(a);
    }
    public void display() {
        for (Customer customer : list) {
            customer.display();
        }
    }
}
