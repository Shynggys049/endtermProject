import java.util.Arrays;
import java.util.List;

public class ProductCatalog {
    private static ProductCatalog instance;
    private List<Product> productCatalog;

    private ProductCatalog() {
        productCatalog = Arrays.asList(
                new Product("Laptop", 999.99),
                new Product("Smartphone", 699.99),
                new Product("Headphones", 199.99)
        );
    }

    public static ProductCatalog getInstance() {
        if (instance == null) {
            instance = new ProductCatalog();
        }
        return instance;
    }

    public List<Product> getProductCatalog() {
        return productCatalog;
    }
}
