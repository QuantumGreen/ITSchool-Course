package session11_abstraction.challenge.challenge4;

public class Main {
    public static void main(String[] args) {
        SomeAbstractClass subClass = new SubClass();
        subClass.a_method();
        subClass.normalMethod();
    }
}
