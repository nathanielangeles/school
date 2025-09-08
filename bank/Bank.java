// bank superclass

// used to store accounts
import java.util.ArrayList;

public class Bank {
    // bank details
    private String bankName;
    private String bankAddress;
    private String bankContact;
    private ArrayList<Account> accounts = new ArrayList<>();

    // constructor to initialize bank details
    public Bank (String name, String address, String contact){
        this.bankName = name;
        this.bankAddress = address;
        this.bankContact = contact;
    }

    // open account method
    public void openAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Opened account for " + acc.getAccountHolder());
    }

    // close account method
    public void closeAccount(Account acc) {
        accounts.remove(acc);
        System.out.println("Closed account for " + acc.getAccountHolder());
    }
    
    // list accounts method (display)
    public void listAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc.getAccountNumber() + ": " + acc.getAccountHolder());
        }
    }

    // get account (to reuse)
    public ArrayList<Account> getAccounts() {
        return accounts;
    }    
}
