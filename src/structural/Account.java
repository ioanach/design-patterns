package src.structural;

/**
 * Structural patterns deal with the way objects are "stuctured" and organized
 * concepts like: inheritance, composition
 */
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
