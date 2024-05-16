package com.Frist.Pr1.Contole;

import com.Frist.Pr1.Entity.Blog   ;
import com.Frist.Pr1.Service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List ;

@RestController
@RequestMapping(value = "api/v/Blog")
@CrossOrigin
@RequiredArgsConstructor

public class Blog_Contol {


/*
    @GetMapping("/getblog")
    public String getblog() {
        return "get blog" ;
    }

    @PostMapping("/save-blog")
    public String saveblog() {
        return "Blog Saved" ;
    }

    @PutMapping("/updateBlog")
    public String updateblog() {
        return "Blog Update ";
    }

    @DeleteMapping("/deleteblog")
    public String deleteblog() {
        return "Blog delete ";

    }



*/
    @Autowired
    private  final BlogService  Service ;

    @GetMapping()
   public List<Blog>getAllblogs(){

        return Service.getAllBlog();
    }


}
