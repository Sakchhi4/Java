import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }


    public Book searchByTitle(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            for (Book b : books) {
                b.display();
            }
        }
    }
}
