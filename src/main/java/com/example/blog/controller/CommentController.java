package com.example.blog.controller;

import com.example.blog.modal.Comment;
import com.example.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @GetMapping("/post/{postId}")
    public List<Comment> getComments(@PathVariable Long postId) {
        return commentService.getCommentsByPostId(postId);
    }
}