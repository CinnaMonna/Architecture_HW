package bce.data;

import bce.domain.Book;
import java.util.List;

public interface BookRepository {
    /**
     * добавляет новую книгу в репозиторий
     * @param book книга для добавления
     */
    void addBook(Book book);

    /**
     * удаляет книгу из репозитория
     * @param book книга для удаления
     */
    void removeBook(Book book);

    /**
     * извлекает список всех книг из репозитория
     * @return список всех книг
     */
    List<Book> getAllBooks();

}
