package com.jcastanodev.blog.repositories;

import com.jcastanodev.blog.entities.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogEntity, Long> {
}
