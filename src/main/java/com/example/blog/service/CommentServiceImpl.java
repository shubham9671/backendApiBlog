package com.example.blog.service;

import com.example.blog.modal.Comment;
import com.example.blog.modal.Post;
import com.example.blog.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getCommentsByPostId(Long postId) {
        return commentRepository.findAll().stream()
                .filter(comment -> comment.getPost().getId().equals(postId))
                .toList();
    }
}