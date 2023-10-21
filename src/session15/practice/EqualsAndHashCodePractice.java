package session15.practice;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCodePractice {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("Alice");
        employee1.setLastName("Bond");

        Employee employee2 = new Employee();
        employee2.setId(1);
        employee2.setFirstName("Alice");
        employee2.setLastName("Bond");

        System.out.println("employee1 equals employee2: " + employee1.equals(employee2));
        System.out.println("employee1 hashCode: " + employee1.hashCode());
        System.out.println("employee2 hashCode: " + employee2.hashCode());

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        System.out.println("set size: "+employeeSet.size());
    }
}
