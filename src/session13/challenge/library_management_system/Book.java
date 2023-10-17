package session13.challenge.library_management_system;

public class Book {
    String title;
    Author author;
    String publisher;
    String isbn;
    int numberOfCopies;

    public Book(String title, Author author, String publisher, String ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = ISBN;

        author.addBook(this);
    }
    public boolean isBookAvailable(){
        return numberOfCopies>0;
    }
    public void addCopies(int quantity){
        if (quantity<0){
            throw new IllegalArgumentException("Can't add a negative number of copies");
        }
        numberOfCopies += quantity;
        System.out.println("Added "+quantity+" copies to "+title+", total: "+numberOfCopies);
    }
    public void removeCopies(int quantity){
        if (quantity<0){
            throw new IllegalArgumentException("Can't remove a negative number of copies");
        }
        numberOfCopies -= quantity;
        numberOfCopies = Math.max(0,numberOfCopies);
        System.out.println("Removed "+quantity+" copies to "+title+", total: "+numberOfCopies);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publisher='" + publisher + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
