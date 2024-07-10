package src.map.Research.Products;

import java.util.HashMap;
import java.util.Map;

public class RegistrationProducts {

    private Map<Long, Product> products = new HashMap<>();

    public void addProduct(long cod, String name, int quantity, double price){
        products.put(cod, new Product(name, quantity, price));
    }

    public void showProducts(){
        System.out.println(products);
    }

    public double calculateTotalValueStock(){
        double total = 0;

        for (Product p : products.values()) {
            total += p.getQuantity() * p.getPrice();
        }

        return total;
    }

    public Product getProductMoreExpensive(){
        Product productMoreExpensive = null;
        double price = 0;

        for (Product p : products.values()) {
            if (p.getPrice() > price){
                productMoreExpensive = p;
                price = p.getPrice();
            }
        }

        return productMoreExpensive;
    }

    public Product getCheapestProduct(){
        Product productCheapest = null;
        double price = Double.MAX_VALUE;

        for (Product p : products.values()) {
            if (p.getPrice() < price){
                productCheapest = p;
                price = p.getPrice();
            }
        }

        return productCheapest;
    }

    public Product getProductLargestQuantityTotalValueInStock(){
        Product productMooreStockValue = null;
        double total = 0;

        for (Product p : products.values()) {
            if ((p.getPrice() * p.getQuantity()) > total){
                productMooreStockValue = p;
                total = (p.getPrice() * p.getQuantity());
            }
        }

        return productMooreStockValue;
    }

}
