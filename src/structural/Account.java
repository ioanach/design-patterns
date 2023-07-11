package src.structural;

public class Account implements AccountActions {
    private float money;

    private String bankName;

    public Account(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void deposit(float amount){
        if(amount > 0){
            money += amount;
        }
    }

   @Override
    public void withdraw(float amount) {
        if(amount > 0){
            money -= amount;
        }
    }

    @Override
    public float getMoneyAvailable() {
        return money;
    }

    public String getBankName() {
        return bankName;
    }


}
