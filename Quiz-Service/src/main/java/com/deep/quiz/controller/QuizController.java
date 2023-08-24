package com.deep.quiz.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deep.quiz.model.QuestionWrapper;
import com.deep.quiz.model.QuizDto;
import com.deep.quiz.model.Response;
import com.deep.quiz.service.QuizService;


@RestController
@RequestMapping("quiz")
public class QuizController {
   
    @Autowired
    QuizService service;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto){
        return service.createQuiz(quizDto.getCategory(), quizDto.getNumQ(), quizDto.getTitle());
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Long id){
		return service.getQuizQuestion(id); 
    }
    
    
    @PostMapping("submit/{id}")
    public ResponseEntity<Long> submitQuiz(@PathVariable Long id, @RequestBody List<Response> responses){
    	return service.calculatedResult(id, responses);
    }
}
