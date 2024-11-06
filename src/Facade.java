public class Facade {
    private Cart cart;
    private ProductCatalog catalog;

    public Facade() {
        cart = new Cart();
        catalog = ProductCatalog.getInstance();
    }

    public void addProductToCart(Product product) {
        cart.addProduct(product);
    }

    public void removeProductFromCart(Product product) {
        cart.removeProduct(product);
    }

    public void viewCart() {
        cart.printCart();
    }

    public void checkout(String paymentMethod) {
        Order order = OrderFactory.createOrder(cart, paymentMethod);
        order.processOrder();
        cart = new Cart();
    }
}
