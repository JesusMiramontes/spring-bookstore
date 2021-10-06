package com.miramontes.bookstore.repositories;

import com.miramontes.bookstore.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {}
