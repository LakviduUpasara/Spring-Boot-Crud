package com.Frist.Pr1.Contole;


import com.Frist.Pr1.Entity.Blog;
import com.Frist.Pr1.Entity.User;
import com.Frist.Pr1.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class User_Control {

    @Autowired
    private  final UserService service ;

    @GetMapping()
    public List<User> getAllUser() {return  service.getAllUser() ;
    }
}
