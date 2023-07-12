package src.structural;

public class BankConnection {
    private final String bankName;

    public BankConnection(String bankName) {
        this.bankName = bankName;
    }

    public void connect() {
        System.out.println("Connected to bank: " + bankName);
    }
}
