package session10_inheritance_encapsulation.practice.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Student student = new Student("Alica", 20);
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());

        student.setAge(-1);
        System.out.println("Student age: " + student.getAge());

        student.setAge(21);
        System.out.println("Student age: " + student.getAge());

    }
}
