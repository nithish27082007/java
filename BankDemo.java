import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    void balanceEnquiry();
}

class Account implements BankAccount {
    double balance = 1000;

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid Deposit Amount");
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid Withdrawal Amount");

        if (amount > balance)
            throw new ArithmeticException("Insufficient Balance");

        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        try {
            System.out.print("Enter Deposit Amount: ");
            double d = sc.nextDouble();
            a.deposit(d);

            System.out.print("Enter Withdrawal Amount: ");
            double w = sc.nextDouble();
            a.withdraw(w);

            a.balanceEnquiry();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}