package entities_enum;

public enum OrderStatus {
    PENDING_PAYAMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int value;

    private OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
