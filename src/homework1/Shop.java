package homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private final List<Product> items = new ArrayList<>();

    public void add(Product item) {
        this.items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }

    public void sortProductsByPrice() {
        Collections.sort(this.items);
    }

    public Product getMostExpensiveProduct() {
        return Collections.max(this.items);
    }
}
