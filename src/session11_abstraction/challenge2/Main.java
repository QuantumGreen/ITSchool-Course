package session11_abstraction.challenge2;

public class Main {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();
        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}
