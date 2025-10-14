public enum OrderStatus {
    PENDING("Order received, waiting for confirmation"),
    SHIPPED("Order on the way"),
    DELIVERED("Order delivered to customer"),
    CANCELLED("Order was cancelled");

    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

