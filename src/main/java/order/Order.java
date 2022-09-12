package order;

import product.Product;

import java.util.ArrayList;
import java.util.Objects;

public class Order {

    private String id;

    private ArrayList<Product> products;

    public Order(String id, ArrayList<Product> products) {
        this.id = id;
        this.products = products;


    }

    public Order(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (!Objects.equals(id, order.id)) return false;
        return Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                '}';
    }
}