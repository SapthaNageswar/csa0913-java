 public class AccountTest {

    static class Account {

        String customerName;
        int accountNumber;
        String accountType;
        double balance;

        // Constructor
        Account(String customerName, int accountNumber, String accountType, double balance) {
            this.customerName = customerName;
            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.balance = balance;
        }

        // Deposit money
        void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
        }

        // Withdraw money
        void withdraw(double amount) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Amount Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance");
            }
        }

        // Display balance
        void displayBalance() {
            System.out.println("Current Balance: " + balance);
        }

        // Display account details
        void displayDetails() {
            System.out.println("Customer Name  : " + customerName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Account Type   : " + accountType);
        }
    }

    public static void main(String[] args) {

        Account acc = new Account("Sap", 123456, "Savings", 5000);

        acc.displayDetails();
        acc.displayBalance();

        acc.deposit(2000);
        acc.displayBalance();

        acc.withdraw(1500);
        acc.displayBalance();
    }
}