public class BankAccount {
    int accountNumber;
    int balance;
    int amount;


    public BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException{
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance for withdrawal");
            } else if (amount<0) {
                throw new InsufficientBalanceException("Withdrawal amount cannot be less than zero");

            }
        balance -= amount;


        }
    }


