package com.deep.quiz.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.deep.quiz.model.QuestionWrapper;
import com.deep.quiz.model.Response;



@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {
    
	@GetMapping("question/generate")
    public ResponseEntity<List<Long>> getQuestionsForQuiz(@RequestParam String category, @RequestParam Long numQ);
	

    @PostMapping("question/getQuestions")
    	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Long> questionId);
    
    @PostMapping("question/getScore")
    public ResponseEntity<Long> getScore(@RequestBody List<Response> responses);
    	
  
	
	
	
}
