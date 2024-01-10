package br.com.project.rabbit.controller;

import br.com.project.rabbit.entity.Comment;
import br.com.project.rabbit.entity.Post;
import br.com.project.rabbit.service.CommentService;
import br.com.project.rabbit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CommentController {
    @Autowired
    PostService postService;
    @Autowired
    CommentService commentService;
    @PostMapping("/comment/{postId}/save")
    public ResponseEntity < ? > save(@PathVariable("postId") Integer id, @RequestBody Comment comment) {
        Map< String, Object > respComment = new LinkedHashMap< String, Object >();
        Post post = postService.findById(id);
        comment.setPost(post);
        commentService.save(comment);
        respComment.put("status", 1);
        respComment.put("message", "Record is Saved Successfully!");
        return new ResponseEntity < > (respComment, HttpStatus.CREATED);
    }
    @GetMapping("/comment/list")
    public ResponseEntity < ? > getComments() {
        Map < String, Object > respComment = new LinkedHashMap < String, Object > ();
        List<Comment> commentList = commentService.findAll();
        if (!commentList.isEmpty()) {
            respComment.put("status", 1);
            respComment.put("data", commentList);
            return new ResponseEntity< >(respComment, HttpStatus.OK);
        } else {
            respComment.clear();
            respComment.put("status", 0);
            respComment.put("message", "Data is not found");
            return new ResponseEntity < > (respComment, HttpStatus.NOT_FOUND);
        }
    }
}