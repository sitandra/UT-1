package homework1;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    public static void main(String[] args) {
        var shop = new Shop();
        shop.add(new Product(1,20.0));
        shop.add(new Product(2,10.0));
        shop.add(new Product(3,10.0));
        shop.add(new Product(4,12.0));
        shop.add(new Product(5,11.0));

        List<Product> items = new ArrayList<>();
        items.add(new Product(1,20.0));
        items.add(new Product(2,10.0));
        items.add(new Product(3,10.0));
        items.add(new Product(4,12.0));
        items.add(new Product(5,11.0));

        List<Product> sortItems = new ArrayList<>();
        sortItems.add(new Product(2,10.0));
        sortItems.add(new Product(3,10.0));
        sortItems.add(new Product(5,11.0));
        sortItems.add(new Product(4,12.0));
        sortItems.add(new Product(1,20.0));

        // assertThat(shop.getItems().size()).isEqualTo(items.size());
        assertThat(shop.getItems()).isEqualTo(items);
        shop.sortProductsByPrice();
        assertThat(shop.getItems()).isEqualTo(sortItems);
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(new Product(1,20.0));
        shop.add(new Product(6,20.0));
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(new Product(6,20.0));
        shop.add(new Product(7,80.0));
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(new Product(7,80.0));
        // assertThat(shop.getItems()).containsAll(items);
        // assertThat(shop.getItems()).containsExactly((Product) items);
        // assertThat(shop.getItems()).containsExactlyElementsOf(items);

    }
}
