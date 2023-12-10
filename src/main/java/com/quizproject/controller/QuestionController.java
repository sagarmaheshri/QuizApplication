package com.quizproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.quizproject.model.Question;
import com.quizproject.service.QuestionService;

public class QuestionController {
	
		@Autowired
	    QuestionService questionService;

	    @GetMapping("allQuestions")
	    public ResponseEntity<List<Question>> getAllQuestions(){
	        return questionService.getAllQuestion();
	    }

	    @GetMapping("category/{category}")
	    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
	        return questionService.getQuestionByCategory(category);
	    }

	    @PostMapping("add")
	    public ResponseEntity<String> addQuestion(@RequestBody Question question){
	        return  questionService.addQuestion(question);
	    }

}
