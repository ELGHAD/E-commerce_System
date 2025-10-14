public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer c1 = new Customer("Hamza", "hamza@example.com");
        Customer c2 = new Customer("Sara", "sara@example.com");

        // Create orders
        Order o1 = new Order(1001, c1, PaymentMethod.CREDIT_CARD);
        Order o2 = new Order(1002, c2, PaymentMethod.PAYPAL);

        // Print default orders
        o1.printOrderDetails();
        o2.printOrderDetails();

        // Update order statuses
        o1.updateStatus(OrderStatus.SHIPPED);
        o2.updateStatus(OrderStatus.CANCELLED);

        // Print after update
        System.out.println("After status updates:");
        o1.printOrderDetails();
        o2.printOrderDetails();
    }
}
