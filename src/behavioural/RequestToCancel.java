package src.behavioural;

public class RequestToCancel extends Request{

    public RequestToCancel(String type) {
        this.setType(type);
    }

    @Override
    public void checkAvailability() throws Exception {
        if(RequestAvailability.REQUEST_TO_CANCEL.isAvailable() == false){
            throw new Exception("Operation not supported");
        } else {
            System.out.println("RequestToCancel is available");
        }
    }

    @Override
    public void validate(float amount) throws Exception{
        if(amount == 0){
            throw  new Exception("Cannot cancel 0 amount");
        }
        System.out.println("RequestToCancel is valid");
    }

    @Override
    public void pay(float amount) throws Exception {
        System.out.println("User has canceled!");
    }
}
