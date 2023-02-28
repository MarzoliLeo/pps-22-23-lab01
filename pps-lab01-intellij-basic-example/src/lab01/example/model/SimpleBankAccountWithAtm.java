package lab01.example.model;

public class SimpleBankAccountWithAtm implements BankAccount{

    private double balance;
    private final AccountHolder holder;

    /* Introduction of quality: Remove repetitive code. */

    private SimpleBankAccount simpleBankAccount;

    /* **** */

    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance) {
        this.holder = holder;
        this.balance = balance;
        this.simpleBankAccount = new SimpleBankAccount(this.holder, this.balance);
    }
    @Override
    public AccountHolder getHolder(){
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(final int userID, final double amount) {
        if (checkUser(userID)) {
            System.out.println("Prima "+amount);
            //TODO Fare un riferimento per delegazione con SimpleBankAccount
            if (checkUser(userID)) {
                this.balance += amount - 1;
            }
            System.out.println("Dopo " + amount);
            //this.balance += amount;
        }
    }

    @Override
    public void withdraw(final int userID, final double amount) {
        if (checkUser(userID) && isWithdrawAllowed(amount)) {
            this.balance -= amount + 1;
            //this.balance -= amount;
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= (amount + 1) /* 1$ di transazione */;
    }

    private boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }
}

