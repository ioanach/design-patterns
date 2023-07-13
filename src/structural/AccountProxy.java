package src.structural;
/**
 * Proxy let's you provide a substitute for another object so that you can control access to that object
 * it allows you to perform actions before or after the request reached the original object
 */
public class AccountProxy implements AccountActions {
    private Account account;
    private BankConnection bankConnection;

    public AccountProxy(Account account) {
        this.account = account;

    }

    private void connectToBank(){
        if(bankConnection == null){
            System.out.println("Connecting to bank: "+ account.getBankName());
            bankConnection = new BankConnection(account.getBankName());
        } else{
            System.out.println("Already connected to bank: "+ account.getBankName());
        }
    }

    @Override
    public void deposit(float amount) {
        connectToBank();
        System.out.println("You are making depositing money!YAY");
        account.deposit(amount);
    }

    @Override
    public void withdraw(float amount) throws Exception{
        connectToBank();
        if(account.getMoneyAvailable() <= amount){
            throw new Exception( "Not enough money!");
        }
        System.out.println("You are making withdrawing money!SAD FACE");
        account.withdraw(amount);
    }

    @Override
    public float getMoneyAvailable() {
        return account.getMoneyAvailable();
    }
}
