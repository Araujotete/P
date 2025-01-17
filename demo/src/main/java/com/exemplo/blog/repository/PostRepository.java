package com.exemplo.blog.repository;

import java.util.List;

import com.exemplo.blog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAll();

    Post save(Post post);

    Object findById(Long id);
}