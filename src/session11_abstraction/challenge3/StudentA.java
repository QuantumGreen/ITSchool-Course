package session11_abstraction.challenge3;

public class StudentA extends Marks {

    private double mark1;
    private double mark2;
    private double mark3;

    public StudentA(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public double getPercentage() {
        return (mark1 + mark2 + mark3) / 3;
    }
}
