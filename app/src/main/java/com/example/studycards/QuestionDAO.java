package com.example.studycards;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface QuestionDAO {

    @Query("INSERT INTO Question(QuestionText, AnswerText) VALUES (:question, :answer)")
    public void insertQuestion(String question, String answer);

/*    @Query("SELECT QuestionText from Question")
    List<String> getAllQuestions();*/
/*
    @Update
    public void updateQuestion(Question question);*/

/*    @Delete
    public void deleteAnswer(String AnswerText);*/

/*
    @Delete
    public void deleteQuestion(String QuestionText);
*/

/*    @Delete
    public void deleteAllQuestions();*/

}
