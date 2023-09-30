package session9.practice.book_management_system;

public class BookManagementSystem {

    public static void main(String[] args) {
        Author alice = new Author("Alice");
        Book book = new Book("Journey to wanderland", alice);

        System.out.println("book title: "+book.getTitle());
        System.out.println("book author: "+book.getAuthorName());
    }
}
