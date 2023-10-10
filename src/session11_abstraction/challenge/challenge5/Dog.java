package session11_abstraction.challenge.challenge5;

public class Dog extends Animals {
    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }

    @Override
    public void cats() {
        System.out.println("this doesn't make sense");
    }
}
