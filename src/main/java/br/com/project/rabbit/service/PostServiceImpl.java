package br.com.project.rabbit.service;

import br.com.project.rabbit.entity.Post;
import br.com.project.rabbit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepo;
    @Override
    public void save(Post post) {
        postRepo.save(post);
    }
    @Override
    public List< Post > findPostList() {
        return postRepo.findAll();
    }
    @Override
    public Post findById(Integer id) {
        return postRepo.findById(id).get();
    }
}
