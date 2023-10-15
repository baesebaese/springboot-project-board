package com.example.project.repository;

import com.example.project.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AricleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
