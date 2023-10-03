package session10_inheritance_encapsulation.practice.encapsulation;

import org.w3c.dom.NameList;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        if (age > 0) {
            this.age = age;
        }
    }


}
