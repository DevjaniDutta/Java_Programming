import java.util.Scanner;

public class bankaccount {
    private int balance = 0;  // Store balance for the account

    // Method to deposit money
    public int deposit(int acc_no, int amount) {
        System.out.println("Depositing ₹" + amount + " to account " + acc_no);
        balance += amount;
        return balance;
    }

    // Method to withdraw money
    public int withdraw(int acc_no, int amount) {
        if (amount <= balance) {
            System.out.println("Withdrawing ₹" + amount + " from account " + acc_no);
            balance -= amount;
        } else {
            System.out.println("Insufficient balance to withdraw ₹" + amount);
        }
        return balance;
    }

    // Method to check balance
    public int checkBalance(int acc_no) {
        System.out.println("Checking balance for account " + acc_no);
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bankaccount account = new bankaccount();

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter account number: ");
            int acc_no = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    int newBalanceAfterDeposit = account.deposit(acc_no, depositAmount);
                    System.out.println("Updated Balance: ₹" + newBalanceAfterDeposit);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    int newBalanceAfterWithdraw = account.withdraw(acc_no, withdrawAmount);
                    System.out.println("Updated Balance: ₹" + newBalanceAfterWithdraw);
                    break;

                case 3:
                    int balance = account.checkBalance(acc_no);
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
