import homework4.main.Book;
import homework4.main.BookRepository;
import homework4.main.BookService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {
    @Test
    public void findBookByIdComplete() {
        Book book1 = mock(Book.class);
        when(book1.getId()).thenReturn("1");
        Book book2 = mock(Book.class);
        when(book2.getId()).thenReturn("2");
        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.findById("1")).thenReturn(book1);
        when(bookRepository.findById("2")).thenReturn(book2);
        BookService bookService = new BookService(bookRepository);
        assertEquals(bookService.findBookById("1").getId(), "1");
        verify(bookRepository, times(1)).findById("1");
        verify(book1, times(1)).getId();
        assertEquals(bookService.findBookById("2").getId(), "2");
        assertNull(bookService.findBookById("3"));
        verify(bookRepository, times(1)).findById("3");
    }

    @Test
    public void findAllComplete() {
        BookRepository bookRepository = mock(BookRepository.class);
        List<Book> fakeData = Arrays.asList(
                new Book("1", "Book 1", "Author 1"),
                new Book("2", "Book 2", "Author 2")
        );
        when(bookRepository.findAll()).thenReturn(fakeData);

        BookService bookService = new BookService(bookRepository);
        List<Book> result = bookService.findAllBooks();
        verify(bookRepository, times(1)).findAll();
        assertEquals(fakeData, result);
    }
}
