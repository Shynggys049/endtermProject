import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void printCart() {
        products.forEach(product -> System.out.println(product));
        System.out.println("Total: $" + calculateTotal());
    }
}
