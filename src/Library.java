import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    // Add user
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " added as a library user.");
    }

    // Display all books
    public void displayBooks() {
        System.out.println("Books in Library:");
        for(Book book : books) {
            book.displayBook();
        }
    }

    // Display all users
    public void displayUsers() {
        System.out.println("Library Users:");
        for(User user : users) {
            user.displayUser();
        }
    }

    // Find book by ID
    public Book findBook(int id) {
        for(Book book : books) {
            if(book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // Find user by ID
    public User findUser(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}

