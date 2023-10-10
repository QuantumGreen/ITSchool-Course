package session11_abstraction.challenge.challenge5;

public class Cat extends Animals {

    @Override
    public void dogs() {
        System.out.println("this doesn't make sense");
    }

    @Override
    public void cats() {
        System.out.println("Cats meow");
    }
}
