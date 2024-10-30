import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to replace a book (e.g., updating the book information)
    public void replaceBook(int bookID, Book newBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookID) {
                books.set(i, newBook);
                return;
            }
        }
        System.out.println("Book not found with ID: " + bookID);
    }

    // Method to search a book by ID
    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null; // If book is not found
    }

    // Method to display all books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
