package com.deep.quiz.model;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    //@ManyToMany
    @ElementCollection
    private List<Long> questionIds;
    
    
    
    public Quiz() {
    	
    }

	

	public Quiz(Long id, String title, List<Long> questionIds) {
		super();
		this.id = id;
		this.title = title;
		this.questionIds = questionIds;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public List<Long> getQuestionIds() {
		return questionIds;
	}



	public void setQuestionIds(List<Long> questions) {
		this.questionIds = questions;
	}

	

    
    
    
    
}
