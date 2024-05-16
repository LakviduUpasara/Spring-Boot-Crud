package com.Frist.Pr1.Contole;


import com.Frist.Pr1.Entity.Comment;
import com.Frist.Pr1.Service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v/Comment")
@RequiredArgsConstructor

public class Comment_contrller {

    @Autowired
    private  final CommentService service ;

    @GetMapping
    public List<Comment> getAllcoment ()
    {
        return service.getAllComment() ;
    }

}
