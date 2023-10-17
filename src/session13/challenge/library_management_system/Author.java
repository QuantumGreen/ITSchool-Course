package session13.challenge.library_management_system;

import java.time.LocalDate;
import java.util.List;

public class Author extends BookManager {
    String name;
    String nationality;
    LocalDate dateOfBirth;

    public Author(String name, String nationality, LocalDate dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
