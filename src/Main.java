import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Sample data
        library.addBook(new Book(1, "Java Basics", "Author A"));
        library.addBook(new Book(2, "OOP Concepts", "Author B"));
        library.addUser(new User(1, "Sasidhar"));
        library.addUser(new User(2, "Shambu"));

        while(true) {
            System.out.println("\n1. Display Books\n2. Display Users\n3. Issue Book\n4. Return Book\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    library.displayUsers();
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    User user = library.findUser(userId);
                    Book book = library.findBook(bookId);
                    if(user != null && book != null) {
                        user.issueBook(book);
                    } else {
                        System.out.println("Invalid User ID or Book ID");
                    }
                    break;
                case 4:
                    System.out.print("Enter User ID: ");
                    userId = scanner.nextInt();
                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextInt();
                    user = library.findUser(userId);
                    book = library.findBook(bookId);
                    if(user != null && book != null) {
                        user.returnBook(book);
                    } else {
                        System.out.println("Invalid User ID or Book ID");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

