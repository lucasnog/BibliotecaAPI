package com.lucasnog.biblioteca.api.repository;

import com.lucasnog.biblioteca.api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
