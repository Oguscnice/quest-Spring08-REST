package com.challenge08SpringREST.challenge08SpringREST.repository;

import com.challenge08SpringREST.challenge08SpringREST.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    // custom query to search to blog post by title or content
    List<Book> findByTitleContainingOrContentContaining(String text, String textAgain);

}