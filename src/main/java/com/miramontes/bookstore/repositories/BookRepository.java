package com.miramontes.bookstore.repositories;

import com.miramontes.bookstore.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {}
