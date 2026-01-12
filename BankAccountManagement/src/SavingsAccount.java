public class SavingsAccount extends BankAccount {

    public SavingsAccount(double AccountNumber, double balance){
        super(AccountNumber, balance);
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }
    @Override
    public void deposit(double amount) {
        System.out.println(balance + amount);
        balance += this.amount;
        System.out.println("The revised balance of Account number " + AccountNumber + " is "+ balance);
    }

    @Override
    public int withdraw(double amount) {
        balance -= this.amount;
        System.out.println("The revised balance of Account number " + AccountNumber + " is "+ balance);
        return 0;
    }


    @Override
    public double calculateInterest(int days, float rate) {
        double interest;
        interest =  ((balance/365)*days*rate/100/365);
        return interest;
    }
}

