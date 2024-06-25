package src.list.basicoperations.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(String name, double price, int amount){
        items.add(new Item(name, price, amount));
    }

    public void removeItem(String name){
        for (Item i : items) {
            if (i.getName().equals(name)){
                items.remove(i);
            }
        }
    }

    public double calculateTotalValue(){
        double total = 0;

        for (Item i : items) {
            total += i.getPrice() * i.getAmount();
        }

        return total;
    }

    public void showItems(){
        System.out.println(items);
    }

}
