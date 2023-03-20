package com.challenge08SpringREST.challenge08SpringREST.repository;

import com.challenge08SpringREST.challenge08SpringREST.controller.BlogController;
import com.challenge08SpringREST.challenge08SpringREST.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRespository extends JpaRepository<Blog, Integer> {

    // custom query to search to blog post by title or content
    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);

}