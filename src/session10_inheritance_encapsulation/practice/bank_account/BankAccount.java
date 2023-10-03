package session10_inheritance_encapsulation.practice.bank_account;

public class BankAccount {

    private double balance;


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount);
        } else {
            System.out.println("The amount is invalid");
        }
    }

    public void withdraw(double amount){
        if (amount > balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdre: " + amount);
        } else {
            System.out.println("Too much");
        }
    }

    public double checkBalance() {
        System.out.println("Your balance is: " + balance);
        return balance;
    }
}
