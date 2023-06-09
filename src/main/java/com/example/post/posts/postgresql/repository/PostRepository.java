package com.example.post.posts.postgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.post.posts.postgresql.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

    List<Post> findByPublished(boolean published);

    List<Post> findByTitleContaining(String title);
    
}
