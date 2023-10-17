package session13.challenge.library_management_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Member extends BookManager {

    public String name;
    public String address;
    public String contactInfo;

    private UUID id;
    private List<LocalDate> overdueDates;

    public Member(String name, String address, String contactInfo) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        overdueDates = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        if (book.isBookAvailable()) {
            super.addBook(book);
            book.removeCopies(1);
            overdueDates.add(LocalDate.now().plusWeeks(2));
        } else {
            System.out.println("Sorry, we're out of copies for that book, please check later");
        }
    }

    @Override
    public boolean removeBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book currentBook = books.get(i);
            LocalDate overdueDate = overdueDates.get(i);
            if (currentBook == book) {
                book.addCopies(1);
                books.remove(i);
                if (LocalDate.now().isAfter(overdueDate)) {
                    System.out.println("BAH! its overdue! you should have given this book before " + overdueDate);
                }
                overdueDates.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean hasOverdueBooks() {
        for (int i = 0; i < books.size(); i++) {
            LocalDate overdueDate = overdueDates.get(i);
            if (LocalDate.now().isAfter(overdueDate)) {
                return true;
            }
        }
        return false;
    }

    public void debugMakeABookOverdue(){
        overdueDates.set(0 , LocalDate.now().minusWeeks(1));
    }

//    public List<Book> getOverdueBooks() {
//        List<Book> overDueBooks = new ArrayList<>();
//        for (int i = 0; i < books.size(); i++) {
//            Book book = books.get(i);
//            LocalDate overdueDate = overdueDates.get(i);
//            if (overdueDate.isAfter(LocalDate.now())) {
//                overDueBooks.add(book);
//            }
//        }
//        return overDueBooks;
//    }
}
