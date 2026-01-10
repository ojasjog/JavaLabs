public class MainApp {

    public static void main(String[] args) throws InsufficientBalanceException {

        BankAccount b = new BankAccount(145678, 250000);

        try {
            b.withdraw(26000);
        }catch (InsufficientBalanceException e){
            System.out.println("Error: " + e.getMessage());
        }

        finally{
            System.out.println("The current balance of Account Number " + b.accountNumber +" is " + b.balance);
        }
    }
}
