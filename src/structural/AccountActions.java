package src.structural;

public interface AccountActions {
    public void deposit(float amount) throws Exception;

    public void withdraw(float amount) throws Exception;

    public float getMoneyAvailable() throws Exception;
}
