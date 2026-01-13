public class Library {

    public static void main(String[] args) {
        Book b1 = new Book(1, "New Book1", "John A.");
        Book b2 = new Book(2, "New Book2", "John B.");
        Book b3 = new Book(3, "New Book3", "John C.");
        Book b4 = new Book(4, "New Book4", "John D.");

        Cupboard c1 = new Cupboard(1);

        c1.addBook(b1);
        c1.addBook(b2);
        c1.addBook(b3);
        c1.addBook(b4);

        c1.displayBooks();

        int reqBook = 2;
        Book foundbook = c1.searchBook(reqBook);
        if (foundbook != null)
            System.out.println("Book found with id: " + reqBook + foundbook);
        else
            System.out.println("Book not found with id " + reqBook);
    }
}
