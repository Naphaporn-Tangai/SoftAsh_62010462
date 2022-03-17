package book;
import book.Interfaces.BookReaderIF;
import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        BookReaderIF book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}