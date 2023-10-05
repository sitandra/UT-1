package homework4.main;

import java.util.List;

/**
 * У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных.
 * Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
 */
public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
