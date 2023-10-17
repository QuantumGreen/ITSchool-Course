package session13.challenge.library_management_system;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author authorMe = new Author("Sam", "Romanian", LocalDate.of(2000,11,25));
        Book book1 = new Book("The Programmers Guide to Paragliding",authorMe,"Penguin","1234");
        book1.addCopies(10);
        Book book2 = new Book("Crocheting in Non-euclidean Space!",authorMe,"Penguin","1234-7");
        book2.addCopies(20);

        Member member = new Member("Freya Schofield","Austria Vienna", "freya.schofield@realmail.com");
        Library library = new Library();
        library.addMember(member);
        library.addBook(book1);
        library.addBook(book2);

        //test print
        System.out.println("  printing AUTHOR books");
        authorMe.printAllBooks();
        System.out.println("  printing LIBRARY books");
        library.printAllBooks();
        System.out.println("  printing MEMEMBER books");
        member.printAllBooks();

        System.out.println("  printing MEMEMBER books AGAIN");
        member.addBook(book1);
        member.printAllBooks();


        // test overdue
        System.out.println("    Testing OVERDUE");
        System.out.println("has overdue books: "+member.hasOverdueBooks());
        member.removeBook(book1);
        member.printAllBooks();

        member.addBook(book2);
        System.out.println("forcing book to be overdue");
        member.debugMakeABookOverdue();
        System.out.println("has overdue books: "+member.hasOverdueBooks());
        member.removeBook(book2);
    }
}
