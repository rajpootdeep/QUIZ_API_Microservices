package com.deep.question.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deep.question.model.Question;
import com.deep.question.model.QuestionWrapper;
import com.deep.question.model.Response;
import com.deep.question.repository.QuestionRepo;
import com.deep.question.service.QuestionService;
 

@RestController
@RequestMapping("question")
public class QuestionConroller {

    @Autowired
    QuestionService questionService;

    @Autowired
    Environment env;
    
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }


    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
         return questionService.getQuestionsByCategory(category);
    }


    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
return questionService.addQuestion(question);
    }
    
    
    
    //
    
    //
    
    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category, @RequestParam Integer numQ){
    	return questionService.getQuestionsForQuiz(category, numQ);
    }

    @PostMapping("getQuestions")
    	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Long> questionId){
    		
    	return questionService.getQuestionsFromId(questionId);
    	}
    
    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
    	
    	System.out.println(env.getProperty("local.server.port"));
    	
    	
    	return questionService.getScore(responses);
    }
    
    
}
