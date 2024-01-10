package br.com.project.rabbit.service;

import br.com.project.rabbit.entity.Comment;
import br.com.project.rabbit.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepo;
    @Override
    public void save(Comment comment) {
        commentRepo.save(comment);
    }
    @Override
    public List<Comment> findAll() {
        return commentRepo.findAll();
    }
}