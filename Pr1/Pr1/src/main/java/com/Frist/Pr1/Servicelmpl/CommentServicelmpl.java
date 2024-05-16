package com.Frist.Pr1.Servicelmpl;

import com.Frist.Pr1.Entity.Comment;
import com.Frist.Pr1.Repostry.CommentRepostry;
import com.Frist.Pr1.Service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CommentServicelmpl implements CommentService {

    @Autowired
    private final CommentRepostry repository ;

    @Override
    public Comment Save(Comment comment)
    {
        return  repository.save(comment) ;
    }

    @Override
    public List<Comment> getAllComment()
    {
        return repository.findAll() ;

    }

    @Override
    public Comment save(Comment comment) {
        return null;
    }

    @Override
    public List<Comment> GetAllComment() {
        return null;
    }

    @Override
    public  boolean delete (UUID CommentId)
    {
        repository.deleteById(CommentId);
        return true ;
    }


}
