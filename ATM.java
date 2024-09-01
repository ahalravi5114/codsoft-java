package atm;
import java.util.*;

class Bank {
    double balance;

    Bank(double initialBalance) {
        balance = initialBalance;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited"+amount+"Successfully.");
        System.out.println("New Balance : ." + balance);
    }

    boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Sorry! The Balance is Insufficient to withdraw.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawn"+amount+"Successfully");
            System.out.println("New Balance : ." + balance);
            return true;
        }
    }

    void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    void processOption(int choice) {
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                withdraw(withdrawalAmount);
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                deposit(depositAmount);
                break;
            case 3:
                System.out.println("Current balance: " + getBalance());
                break;
            case 4:
                System.out.println("Thank You!!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please choose again.");
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        double initialBalance = 50000;
        String name;
        long acc_no;
        System.out.println("Welcome to the ATM!");
        Bank bank = new Bank(initialBalance);
        System.out.println("Enter you name:");
        name = o.nextLine();
        System.out.println("Enter your account number:");
        acc_no = o.nextInt();

        while (true) {
            bank.displayMenu();
            System.out.print("Enter your choice: ");

            if (o.hasNextInt()) {
                int userChoice = o.nextInt();
                bank.processOption(userChoice);
            } else {
                System.out.println("Invalid input. Please enter a number.");
                o.next(); 
            }
        }
    }
}
