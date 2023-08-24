package com.deep.quiz.model;

import lombok.Data;

@Data
public class QuizDto {

	
	private String category;
	private Long numQ;
	private String title;
	
	
	
	
	
	public QuizDto(){
		
	}
	
	public QuizDto(String category, Long numQ, String title) {
		super();
		this.category = category;
		this.numQ = numQ;
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getNumQ() {
		return numQ;
	}
	public void setNumQ(Long numQ) {
		this.numQ = numQ;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
	
	
	
}

