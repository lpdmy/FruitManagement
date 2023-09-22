package controller;

import common.Library;
import java.util.ArrayList;
import model.Customer;
import model.CustomerList;
import model.Fruit;
import model.Order;
import view.Menu;

public class FruitCompany extends Menu<String> {

    int orderId = 0;
    int cusId = 0;
    static String[] menu = {"Create Fruit", "View orders", "Shopping (for buyers)", "Exit"};
    FruitLogistics list = new FruitLogistics();
    Library lib = new Library();
    CustomerList cus = new CustomerList();
//    Hashtable<Integer, ArrayList<Order>> table = new Hashtable<>();

    public FruitCompany() {
        super("FRUIT SHOP SYSTEM", menu);
    }
//--------------------------------------------------

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.addFruit(addFruit());
                while (lib.getYN("Do you want to continue? (Y/N)").equalsIgnoreCase("Y")) {
                    list.addFruit(addFruit());
                }
                ;
                break;
            case 2:
                //in ra cac order cua khach hang
                cus.display();
                break;
            case 3:
                cus.addCustomer(addCustomer());
                break;
            case 4:
                System.exit(0);
        }
    }
//--------------------------------------------------

    public Fruit addFruit() {
        String name = lib.getString("Enter fruit name ");
        double price = lib.getDouble("Enter price ");
        int quantity = lib.getInt("Enter quantity ");
        String origin = lib.getString("Enter origin ");
        return new Fruit(name, price, quantity, origin);
    }

    public Order addOrder() {

        list.display();
        int fruitId = lib.getInt("Enter your selection: ", 1, list.lastIndex());
        System.out.println("Your selection: " + list.fruitAtKey(fruitId).getName());
        int quantity = lib.getInt("Please input quantity: ", 0, list.fruitAtKey(fruitId).getQuantity());
        return new Order(orderId++, quantity, list.fruitAtKey(fruitId));
    }

    public Customer addCustomer() {
        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(addOrder());
        while (lib.getYN("Do you want to order now? (Y/N)").equalsIgnoreCase("N")) {
            orderList.add(addOrder());
        }
        for (Order order : orderList) {
            if (order.getQuantity() > 0) {
                System.out.println(order);
            }
        }
        String name = lib.getString("Input your name");
//        table.put(cusId++, orderList);
        cusId++;
        Customer customer = new Customer(cusId, name, orderList);

        return customer;
    }
//--------------------------------------------------------
}
