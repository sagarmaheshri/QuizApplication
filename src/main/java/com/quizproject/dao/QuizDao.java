package com.quizproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.quizproject.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
	
	

}
