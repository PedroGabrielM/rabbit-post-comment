package br.com.project.rabbit.service;

import br.com.project.rabbit.entity.Comment;

import java.util.List;

public interface CommentService {
    void save(Comment comment);
    List<Comment> findAll();
}