package com.deep.question.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deep.question.model.Question;



@Repository
public interface QuestionRepo  extends JpaRepository<Question, Long>{

    List<Question> findByCategory(String category);


   @Query(value = "Select id from question where category= ?1 order by RAND() LIMIT ?2", nativeQuery=true)
    List<Integer> findRandomQuestionsByCategory(String category,int numQ);

    
}
