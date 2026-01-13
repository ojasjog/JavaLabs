import java.util.ArrayList;
import java.util.List;

public class Cupboard {
    int cupboardId;
    List<Book> books;

    public Cupboard(int cupboardId) {
        this.cupboardId = cupboardId;
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }


    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book + " ");
        }
    }

    public Book searchBook(int bookId){
        for(Book book: books){
            if(book.bookId == bookId){
                return book;
            }
        }
        return null;
    }
}


