package com.Frist.Pr1.Repostry;

import com.Frist.Pr1.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentRepostry extends JpaRepository<Comment , UUID> {
}
