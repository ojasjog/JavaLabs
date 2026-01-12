abstract class BankAccount {
    double AccountNumber, balance, amount;



    public BankAccount(double AccountNumber, double balance){
        this.AccountNumber = AccountNumber;
        this.balance = balance;


    }

    public abstract void deposit(double amount);
    public abstract int withdraw(double amount);



    public abstract double calculateInterest(int days, float rate);
}
