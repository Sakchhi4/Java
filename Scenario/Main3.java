public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("Python Guide", "Guido van Rossum", "102");

        library.addBook(b1);
        library.addBook(b2);

        System.out.println("\nAll Books:");
        library.displayAllBooks();

        System.out.println("\nSearching for 'Java Basics':");
        Book found = library.searchByTitle("Java Basics");

        if (found != null) {
            found.display();
        } else {
            System.out.println("Book not found.");
        }
    }
}
