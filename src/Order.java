public class Order {
    private int orderId;
    private Customer customer;
    private PaymentMethod paymentMethod;
    private OrderStatus status;

    public Order(int orderId, Customer customer, PaymentMethod paymentMethod) {
        this.orderId = orderId;
        this.customer = customer;
        this.paymentMethod = paymentMethod;
        this.status = OrderStatus.PENDING; // default status
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Status: " + status + " — " + status.getDescription());
        System.out.println("-------------------------------");
    }
}
