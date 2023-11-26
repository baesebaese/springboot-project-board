package com.example.project.repository;

import com.example.project.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AricleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
