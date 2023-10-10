package session11_abstraction.challenge.challenge4;

public abstract class SomeAbstractClass {
    SomeAbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}
