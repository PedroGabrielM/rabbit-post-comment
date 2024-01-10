package br.com.project.rabbit.configuration;

import br.com.project.rabbit.service.CommentServiceImpl;
import br.com.project.rabbit.service.PostServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public CommentServiceImpl commentService() {
        return new CommentServiceImpl();
    }

    @Bean
    public PostServiceImpl postService() {
        return new PostServiceImpl();
    }
}
