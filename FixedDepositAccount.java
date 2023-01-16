package sg.nus.edu.iss;

public class FixedDepositAccount extends BankAccount {

    public static double interest = 3.0;
    public static double duration = 6.0;

    public FixedDepositAccount(String accountNo, double balance) {
        super(accountNo, balance);
        //TODO auto generated constructor stub
    }

    @Override
    public void deposit(double amount) {
        System.out.println("No Deposit Operation");

    }

    @Override
    public void withdraw(double amount) {
        System.out.println("No Withdrawal Operation");

    }

    @Override
    public void showAccount() {
        System.out.println("Account no: " + this.getAccountNo());
        System.out.println("Fullname: " + this.getFullName());
        System.out.println("Balance: " + this.getBalance() * (100 + interest)/100);
    }
    
}
