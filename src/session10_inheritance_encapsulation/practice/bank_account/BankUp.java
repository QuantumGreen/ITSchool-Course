package session10_inheritance_encapsulation.practice.bank_account;

public class BankUp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.checkBalance();
        account.deposit(500.35);
        account.withdraw(200.35);
        account.checkBalance();
    }
}
