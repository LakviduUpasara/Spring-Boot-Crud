package com.Frist.Pr1.Repostry;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Frist.Pr1.Entity.User ;

import java.util.UUID;

public interface UserRepostry extends JpaRepository<User , UUID> {
}
