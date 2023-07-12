package src.behavioural;

/**
 * Behavioural patterns -> interaction/communication between objects
 * distribution of responsibilities
 *
 */
public abstract class Request {
    private String type;

    /**
     * This is the template method
     * Template design pattern defines the skeleton of the algorithm in the super class
     * but allows subclasses to override specific steps of the algorithm
     *
     * @param amount
     * @throws Exception
     */
    public final void submit(float amount) throws Exception {
        checkAvailability();
        validate(amount);
        pay(amount);
    }

    protected abstract void checkAvailability() throws Exception;

    protected abstract void validate(float amount) throws Exception;

    protected abstract void pay(float amount) throws Exception;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
