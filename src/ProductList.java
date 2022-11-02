import java.util.HashSet;
import java.util.Set;

public class ProductList {

    private final Set<Products> products = new HashSet<>();

    public void addProduct(Products product) {
        if (products.contains(product)) {
            throw new RuntimeException("Товар уже в списке");
        } else if (product != null) {
            products.add(product);
            product.setBoughtStatus(true);
        }
    }

    public void removeProduct(Products product) {
        products.remove(product);
        product.setBoughtStatus(false);
    }
}
