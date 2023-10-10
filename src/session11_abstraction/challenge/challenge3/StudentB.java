package session11_abstraction.challenge.challenge3;

public class StudentB extends Marks {

    private double mark1;
    private double mark2;
    private double mark3;
    private double mark4;

    public StudentB(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    public double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4;
    }
}
