package com.deep.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deep.quiz.model.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Long> {

}
