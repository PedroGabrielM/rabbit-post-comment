package br.com.project.rabbit.service;

import br.com.project.rabbit.entity.Post;

import java.util.List;

public interface PostService {
    void save(Post post);
    List<Post> findPostList();
    Post findById(Integer id);
}
