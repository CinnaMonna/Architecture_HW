package bce.data;

import bce.domain.Book;

import java.util.ArrayList;
import java.util.List;

/**+
 * Класс InMemoryBookRepository представляет реализацию интерфейса BookRepository,
 * использует список для хранения книг.
 */

public class InMemoryBookRepository implements BookRepository{
    private List<Book> books;

    /**
     * создает новый экземпляр класса InMemoryBookRepository
     */

    public InMemoryBookRepository() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(Integer.parseInt(book.getId()) - 1, book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(Integer.parseInt(book.getId()) - 1);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}
