package com.Frist.Pr1.Servicelmpl;

import com.Frist.Pr1.Entity.Blog;
import com.Frist.Pr1.Repostry.BlogReposrty;
import com.Frist.Pr1.Service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List ;
import java.util.UUID ;


@Service
@RequiredArgsConstructor
public class BlogServicelpm implements  BlogService {

    @Autowired
    private final BlogReposrty  Repostry ;

    @Override
    public  Blog save(Blog blog ) {return  Repostry.save(blog) ;}

    @Override
    public List<Blog> getAllBlog () { return  Repostry.findAll() ;} ;

    @Override
    public boolean delete(UUID BlogId)
    {
        Repostry.deleteById(BlogId);
        return true ;
    }







}
