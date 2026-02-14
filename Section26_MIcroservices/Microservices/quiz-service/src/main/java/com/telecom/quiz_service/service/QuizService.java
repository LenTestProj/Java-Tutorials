package com.telecom.quiz_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.telecom.quiz_service.dao.QuizDao;
import com.telecom.quiz_service.feign.QuizInterface;
import com.telecom.quiz_service.model.QuestionWrapper;
import com.telecom.quiz_service.model.Quiz;
import com.telecom.quiz_service.model.Response;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;

    @Autowired
    QuizInterface quizInterface;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        // List<Integer> questions = //call the geenrate url - RestTemplate http://localhost:8080/createQuiz

        // List<Question> questions = questionDao.findRandomQuestionsByCategory(category,numQ);

        // Quiz quiz = new Quiz();
        // quiz.setTitle(title);
        // quiz.setQuestions(questions);
        // quizDao.save(quiz);

        List<Integer> questions = quizInterface.getQuestionsForQuiz(category,numQ).getBody();

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIds(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Quiz quiz = quizDao.findById(id).get();
        List<Integer> questionIds = quiz.getQuestionIds();

        ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromId(questionIds);

        return questions;
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
       
        ResponseEntity<Integer> score = quizInterface.getScore(responses);

        return score;
    }
}
