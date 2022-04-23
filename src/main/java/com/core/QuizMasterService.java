package com.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuizMasterService {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	private QuizMaster quizMaster;
	
	public QuizMasterService(QuizMaster quizMaster) {
		this.quizMaster = quizMaster;
	}

	public void setQuizMaster(QuizMaster quizMaster) {
		this.quizMaster = quizMaster;
	}

	public void askAQuestion(){
		logger.info("Hurray.... Auto wiring, byName/byType works ....!");
		logger.info(quizMaster.askAQuestion());
	}
}
