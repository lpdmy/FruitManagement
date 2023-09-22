package controller;

import java.util.LinkedHashMap;
import java.util.Map;
import model.Fruit;

public class FruitLogistics {
    int id = 0;
    LinkedHashMap<Integer, Fruit> table = new LinkedHashMap<>();
    
    public void addFruit(Fruit a) {
        id++;
        table.put(id, a);
    }
    
   
    
    public void display() {
        System.out.println("| ++Item++ | ++Fruit Name++ | ++Origin++ | ++Price++ | ++Quantity++ |");
        for (Map.Entry<Integer, Fruit> entry : table.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
    
    public int lastIndex() {
        return table.size();
    }
    
    public Fruit fruitAtKey(int n) {
        return table.get(n);
    }
    

}
