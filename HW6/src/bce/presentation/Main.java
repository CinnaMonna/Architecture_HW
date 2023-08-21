package bce.presentation;

import bce.data.BookRepository;
import bce.data.InMemoryBookRepository;
import bce.domain.Book;

import java.util.List;

/**
 * класс Main отвечает за запуск приложения и управление книгами в хранилище.
 *
 */
public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new InMemoryBookRepository();

        // Добавляем книги в магазин
        Book book1 = new Book("1", "Clean Code", "Robert C. Martin", 34.99);
        Book book2 = new Book("2", "Effective Java", "Joshua Bloch", 29.99);
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);

        // Получаем и выводим список всех книг в магазине
        List<Book> books = bookRepository.getAllBooks();
        for (Book book : books) {
            System.out.println("Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
    }
}