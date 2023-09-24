package homework1.main;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private final int id;
    private final Double cost;

    public Product(int id, Double cost) {
        this.id = id;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && cost.equals(product.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cost);
    }

    @Override
    public int compareTo(Product o) {
        int result = this.cost.compareTo(o.cost);
        if (result == 0) return this.id - o.id;
        else return result;
    }

    @Override
    public String toString() {
        return id + " – " + cost;
    }
}
