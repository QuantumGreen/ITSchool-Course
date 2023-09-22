package session7_java_utilities.practice;

public class Classroom {

    public static void main(String[] args) {
        Student studentJohn = new Student();
        studentJohn.name = "John";
        studentJohn.age = 21;
        studentJohn.displayName();

        Student studentAlice = new Student();
        studentAlice.name = "Alice";
        studentAlice.age = 20;
        studentAlice.displayName();

        String name = "Bill";
        name = name.toLowerCase();
    }
}
