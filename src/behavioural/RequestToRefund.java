package src.behavioural;

public class RequestToRefund extends Request{
    public RequestToRefund(String type) {
        this.setType(type);
    }

    @Override
    public void checkAvailability() throws Exception {
        if(RequestAvailability.REQUEST_TO_REFUND.isAvailable() == false){
            throw new Exception("Operation not supported");
        } else {
            System.out.println("RequestToRefund is available");
        }
    }

    @Override
    public void validate(float amount) throws Exception{
        if(amount >= 0){
            throw  new Exception("Cannot refund positive or 0 amount");
        }
        System.out.println("RequestToRefund is valid");
    }

    @Override
    public void pay(float amount) {
        System.out.println("Shop has refunded user with amount "+ amount);
    }
}
