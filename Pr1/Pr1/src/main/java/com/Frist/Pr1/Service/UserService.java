package com.Frist.Pr1.Service;

import com.Frist.Pr1.Entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    User save (User user) ;

    List<User> getAllUser();

    boolean delete (User UserId) ;

    boolean delete(UUID UserId);
}
