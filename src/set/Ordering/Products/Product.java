package src.set.Ordering.Products;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private String name;
    private long cod;
    private double price;
    private int quantity;

    public Product(String name, long cod, double price, int quantity) {
        this.name = name;
        this.cod = cod;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return cod == product.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }

    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getName());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cod=" + cod +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}
