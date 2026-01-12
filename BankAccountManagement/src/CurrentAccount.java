public class CurrentAccount extends BankAccount {

    public CurrentAccount(double AccountNumber, double balance){
        super(AccountNumber, balance);
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }
    @Override
    public void deposit(double amount) {
        balance += this.balance;
        System.out.println("The revised balance of Account number " + AccountNumber + " is "+ balance);
    }

    @Override
    public int withdraw(double amount) {
        balance -= this.balance;
        System.out.println("The revised balance of Account number " + AccountNumber + " is "+ balance);

        return 0;
    }

    @Override
    public double calculateInterest(int days, float rate) {
        double interest = 0;

        return interest;
    }
}
