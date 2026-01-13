public class Book {
    int bookId;
    String name, author;

    public Book(int bookId, String name, String author) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
    }


    @Override
    public String toString() {
        return
                '{' + "bookId=" + bookId +
                        ", name='" + name + '\'' +
                        ", author='" + author + '\'' +
                        '}';
    }
}
