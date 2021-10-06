package com.miramontes.bookstore.bootstrap;

import com.miramontes.bookstore.model.Author;
import com.miramontes.bookstore.model.Book;
import com.miramontes.bookstore.model.Publisher;
import com.miramontes.bookstore.repositories.AuthorRepository;
import com.miramontes.bookstore.repositories.BookRepository;
import com.miramontes.bookstore.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    //    @Autowired
    public BootStrapData(
            AuthorRepository authorRepository,
            BookRepository bookRepository,
            PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author("Jesus", "Miramontes");
        Book book1 = new Book("My book 1", "123123");

        author1.addBook(book1);
        book1.addAuthor(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);

        Book book2 = new Book("My book 2", "22222");
        Author author2 = new Author("John", "Cook");

        author2.addBook(book2);
        book2.addAuthor(author2);

        authorRepository.save(author2);
        bookRepository.save(book2);

        Publisher publisher = new Publisher("Address 1", "City 1", "State 1", "111111");
        publisherRepository.save(publisher);

        System.out.println("bookRepository.count() = " + bookRepository.count());
        System.out.println("publisherRepository.count() = " + publisherRepository.count());
    }
}
