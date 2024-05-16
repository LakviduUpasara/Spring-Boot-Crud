package com.Frist.Pr1.Service;

import com.Frist.Pr1.Entity.Comment;

import java.util.List;
import java.util.UUID;

public interface CommentService  {


    Comment save (Comment comment) ;

    List<Comment> GetAllComment ();

    boolean delete (UUID CommentId) ;


    Comment Save(Comment comment);

    List<Comment> getAllComment();
}
