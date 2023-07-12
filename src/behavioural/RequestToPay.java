package src.behavioural;

public class RequestToPay extends Request {
    public RequestToPay(String type) {
        this.setType(type);
    }

    @Override
    public void checkAvailability() throws Exception {
        if (!RequestAvailability.REQUEST_TO_PAY.isAvailable()) {
            throw new Exception("Operation not supported");
        } else {
            System.out.println("RequestToPay is available");
        }
    }

    @Override
    public void validate(float amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Amount has to be positive");
        }
        System.out.println("RequestToPay is valid");
    }

    @Override
    public void pay(float amount) {
        System.out.println("User has payed!");
    }
}
