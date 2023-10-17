package session13.challenge.library_management_system;

import java.util.ArrayList;
import java.util.List;

// note: while I will use inheritance in my approach, composition (has-a) would offer greater flexibility
// at the cost of some light code duplication
public class BookManager {
    List<Book> books;

    public BookManager(){
        books = new ArrayList<>();
    }


    public void addBook(Book book){
        books.add(book);
    }
    public boolean removeBook(Book book){
        return books.add(book);
    }

    public void printAllBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBookByTitle(String title){
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }
    public Book findBookByAuthor(Author author){
        for (Book book : books) {
            if (book.author == author) {
                return book;
            }
        }
        return null;
    }
    public Book findBookByISBN(String isbn){
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
