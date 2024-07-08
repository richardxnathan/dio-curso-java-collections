package src.set.Ordering.Products;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegistrationProducts {

    private Set<Product> products = new HashSet<>();

    public void addProduct(String name, long cod, double price, int quantity){
        products.add(new Product(name, cod, price, quantity));
    }

    public Set<Product> showProductsByName() {
        Set<Product> productsByName = new TreeSet<>(products);

        return productsByName;
    }

    public Set<Product> showProductsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
        productsByPrice.addAll(products);
        return productsByPrice;
    }

}
