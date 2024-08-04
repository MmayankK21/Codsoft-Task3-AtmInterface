import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: ₹" + String.format("%.2f", balance));
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: ₹" + String.format("%.2f", balance));
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("===============================================");
        System.out.println("|                                             |");
        System.out.println("|             Welcome to the ATM              |");
        System.out.println("|                                             |");
        System.out.println("===============================================");
        System.out.println("| Options:                                    |");
        System.out.println("| 1. Withdraw                                 |");
        System.out.println("| 2. Deposit                                  |");
        System.out.println("| 3. Check Balance                            |");
        System.out.println("| 0. Exit                                     |");
        System.out.println("===============================================");
        System.out.print("Please choose an option: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ₹");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.println("Your current balance: ₹" + String.format("%.2f", account.getBalance()));
                break;
            case 0:
                System.out.println("===============================================");
                System.out.println("|         Thank you for using our ATM         |");
                System.out.println("|              Have a nice day!               |");
                System.out.println("===============================================");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please choose again.");
                break;
        }

        System.out.println();
        displayMenu();
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount userAccount = new BankAccount(100000.0);

        ATM atm = new ATM(userAccount);

        atm.displayMenu();
    }
}
