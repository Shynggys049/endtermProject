import java.util.List;

public class Order {
    private List<Product> products;
    private double totalPrice;
    private String paymentMethod;

    public Order(List<Product> products, String paymentMethod) {
        this.products = products;
        this.totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
        this.paymentMethod = paymentMethod;
    }

    public void processOrder() {
        System.out.println("Processing order...");
        System.out.println("Total: $" + totalPrice);
        System.out.println("Payment method: " + paymentMethod);
    }
}
