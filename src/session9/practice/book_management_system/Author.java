package session9.practice.book_management_system;

import java.util.List;

public class Author {

    private String name;
    private List<Book> writtenBooks;
    public Author(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
