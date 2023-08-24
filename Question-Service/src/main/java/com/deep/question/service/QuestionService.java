package com.deep.question.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.deep.question.model.Question;
import com.deep.question.model.QuestionWrapper;
import com.deep.question.model.Response;
import com.deep.question.repository.QuestionRepo;



@Service
public class QuestionService {

    @Autowired
    QuestionRepo repo;

    public ResponseEntity<List<Question>> getAllQuestions() {

        try{
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<Question>(), HttpStatus.BAD_REQUEST);
    }



    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {

        try{
        return new ResponseEntity<>(repo.findByCategory(category), HttpStatus.OK) ;
        }catch (Exception e){
    e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<Question>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
        repo.save(question);
        return new ResponseEntity<String>("Success", HttpStatus.CREATED);
    }



	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String category, Integer numQ) {
		
		List<Integer> questions=repo.findRandomQuestionsByCategory(category, numQ);
		
		return new ResponseEntity<>(questions,HttpStatus.OK);
		
		
	}



	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Long> questionId) {
		List<QuestionWrapper> qw=new  ArrayList<>();
		
		
		List<Question> questions=new ArrayList<>();
		for(Long id : questionId) {
			questions.add(repo.getReferenceById(id));
		}
		
		for(Question question : questions) {
			QuestionWrapper wrapper =new QuestionWrapper();
			wrapper.setId(question.getId());
			wrapper.setQuestionTitle(question.getQuestionTitle());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			wrapper.setOption4(question.getOption4());
			qw.add(wrapper);
		}
		
		return new ResponseEntity<>(qw,HttpStatus.OK);
	}



	public ResponseEntity<Integer> getScore(List<Response> responses) {
		
		Integer right=0;
		for(Response  response : responses) {
			Optional<Question> question = repo.findById(response.getId());
			if(response.getResOption().equals(question.get().getRightAnswer()))
					right++;
		}
		
		
	return new ResponseEntity<Integer>(right, HttpStatus.OK);
	}

}
