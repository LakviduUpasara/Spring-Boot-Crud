package com.Frist.Pr1.Service;

import com.Frist.Pr1.Entity.Blog ;

import java.util.List;
import java.util.UUID;

public interface BlogService {

    Blog save (Blog blog) ;

    List<Blog> getAllBlog ();

    boolean delete (UUID BlockID) ;

}
