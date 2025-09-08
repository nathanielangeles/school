public abstract class Account {
    // fields for account details
    protected String accountNumber;
    protected String accountHolder;
    protected float balance;

    // constructor to initialize account details
    public Account(String accountNumber, String accountHolder, float balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // abstract - must be implemented by subclasses
    public abstract void deposit(float amount);
    public abstract void withdraw(float amount);
    
    // getters
    public float getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
