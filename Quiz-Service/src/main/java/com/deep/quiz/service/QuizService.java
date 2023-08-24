package com.deep.quiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.deep.quiz.feign.QuizInterface;
import com.deep.quiz.model.QuestionWrapper;
import com.deep.quiz.model.Quiz;
import com.deep.quiz.model.Response;
import com.deep.quiz.repository.QuizRepo;

@Service
public class QuizService {

	@Autowired
	QuizRepo repo;

	@Autowired
	QuizInterface quizInterface;

	public ResponseEntity<String> createQuiz(String category, Long numQ, String title) {

		List<Long> questions = quizInterface.getQuestionsForQuiz(category, numQ).getBody();

		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionIds(questions);
		repo.save(quiz);
//		
//List<Integer> questions = // call the generate URL of Question Service - RestTemplate http://localhost:8081/question/generate
//
		return new ResponseEntity<>("Success", HttpStatus.CREATED);
	}
	

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Long id) {

		Optional<Quiz> quiz = repo.findById(id);
		List<Long> questionIds = quiz.get().getQuestionIds();
		ResponseEntity<List<QuestionWrapper>> questions=quizInterface.getQuestionsFromId(questionIds);

		return questions;

	}

	public ResponseEntity<Long> calculatedResult(Long id, List<Response> responses) {
		ResponseEntity<Long> score =quizInterface.getScore(responses);
		return score;
	}

}
