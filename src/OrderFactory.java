public class OrderFactory {
    public static Order createOrder(Cart cart, String paymentMethod) {
        return new Order(cart.products, paymentMethod);
    }
}
