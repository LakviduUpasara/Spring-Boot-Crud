package com.Frist.Pr1.Servicelmpl;


import com.Frist.Pr1.Entity.User;
import com.Frist.Pr1.Repostry.UserRepostry;
import com.Frist.Pr1.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServicelmpl implements UserService {

    @Autowired
    private  final UserRepostry Repostry ;

    @Override
    public User  save(User user) {return Repostry.save(user) ;}

    @Override
    public List<User> getAllUser()
    {
        return Repostry.findAll() ;
    }

    @Override
    public boolean delete(User UserId) {
        return false;
    }

    @Override
    public boolean delete(UUID UserId)
    {
        Repostry.deleteById(UserId);
        return true ;
    }




}
