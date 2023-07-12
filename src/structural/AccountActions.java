package src.structural;

public interface AccountActions {
    void deposit(float amount) throws Exception;

    void withdraw(float amount) throws Exception;

    float getMoneyAvailable() throws Exception;
}
