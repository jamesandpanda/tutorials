package heist;

/**
 * A single access to a bank account.
 * 
 * @author Nick Patrikeos + @your name
 */
public class BankAccountAccessor {
    private BankAccount account;

    // This is the only instance of this class that should exist at any given
    // point in time; initially, it will be null, but it should be constructed
    // the first time that someone calls getInstance() while this is null
    private static BankAccountAccessor instance;

    // The constructor becomes private, since we want to enforce that only
    // one instance of this class exists at any given point in time.
    private BankAccountAccessor(BankAccount account) {
        this.account = account;
    }

    // This essentially becomes the 'new constructor', and is how users will
    // obtain an instance of this class.
    public synchronized static BankAccountAccessor getInstance(BankAccount account) {
        if (instance == null) {
            instance = new BankAccountAccessor(account);
        }

        return instance;
    }

    // The 'synchronized' keyword ensures that this method cannot be called concurrently.
    // BOTH the getInstance() method and the synchronized keyword are required to
    // avoid a race condition.
    // - The singleton pattern ensures that only one instance exists in the system
    // - The synchronized keyword ensures that the instance is only accessed one at a time
    public synchronized void withdraw(String user, int numberOfWithdrawals, int amountPerWithdrawal) {
        System.out.println(user + " is accessing the bank.");

        for (int i = 0; i < numberOfWithdrawals; i++) {
            if (account.withdraw(amountPerWithdrawal)) {
                System.out.println(user + " successfully withdrew $" + amountPerWithdrawal);
            } else {
                System.out.println(user + " failed to withdraw $" + amountPerWithdrawal + ".");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                
            }
        }

        System.out.println(user + " is leaving the bank, the balance is $" + account.getBalance());
    }
}
