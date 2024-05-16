package com.Frist.Pr1.Repostry;

import com.Frist.Pr1.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlogReposrty extends JpaRepository<Blog , UUID> {
}
