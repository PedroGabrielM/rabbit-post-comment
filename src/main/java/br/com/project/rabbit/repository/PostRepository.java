package br.com.project.rabbit.repository;

import br.com.project.rabbit.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
