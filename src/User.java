import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private ArrayList<Book> issuedBooks;

    // Constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Issue book to user
    public void issueBook(Book book) {
        if(!book.isIssued()) {
            book.issueBook();
            issuedBooks.add(book);
        } else {
            System.out.println("Cannot issue. Book already issued.");
        }
    }

    // Return book to user
    public void returnBook(Book book) {
        if(issuedBooks.contains(book)) {
            book.returnBook();
            issuedBooks.remove(book);
        } else {
            System.out.println("This user did not issue this book.");
        }
    }

    // Display user info
    public void displayUser() {
        System.out.println("User ID: " + id + ", Name: " + name);
        System.out.println("Issued Books:");
        for(Book book : issuedBooks) {
            System.out.println("- " + book.getTitle());
        }
    }
}

