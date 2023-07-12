package src.behavioural;

public enum RequestAvailability {
    // user can pay
    REQUEST_TO_PAY("RequestToPay", true),
    //user can cancel pay
    REQUEST_TO_CANCEL("RequestToCancel", true),
    //shop can refund user
    REQUEST_TO_REFUND("RequestToRefund", false);

    private final String requestType;

    private final boolean isAvailable;

    RequestAvailability(String requestType, boolean isAvailable) {
        this.requestType = requestType;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
