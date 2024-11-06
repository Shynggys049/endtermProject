import java.util.List;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        ProductCatalog catalog = ProductCatalog.getInstance();

        List<Product> products = catalog.getProductCatalog();
        facade.addProductToCart(products.get(0)); // Добавить Laptop
        facade.addProductToCart(products.get(1)); // Добавить Smartphone

        facade.viewCart();

        facade.checkout("Credit Card");

        facade.addProductToCart(products.get(2));
        facade.viewCart();
        facade.checkout("Cash");
    }
}
