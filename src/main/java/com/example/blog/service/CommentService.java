package com.example.blog.service;

import com.example.blog.modal.Comment;
import java.util.List;

public interface CommentService {
    Comment addComment(Comment comment);
    List<Comment> getCommentsByPostId(Long postId);
}