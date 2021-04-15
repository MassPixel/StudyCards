package com.example.myapplication1.data;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface QuestionDAO {

    @Query("INSERT INTO Question (QuestionText, AnswerText) VALUES (:question, :answer)")
    public void insertQuestion(String question, String answer);

    @Query("SELECT QuestionText from Question")
    List<String> getAllQuestions();

    @Query("DELETE FROM Question")
    public void nukeQuestions();

/*
    @Query("UPDATE QuestionText from Question where QuestionText = :QuesionText")
    public void updateQuesstion(String QuestionText);
*/

    @Update
    public void updateQuestion(Question question);

    @Query("DELETE FROM Question WHERE QuestionText = :text")
    public void deleteQuestion(String text);

    @Query("DELETE FROM Question")
    public void deleteAllQuestions();

}
