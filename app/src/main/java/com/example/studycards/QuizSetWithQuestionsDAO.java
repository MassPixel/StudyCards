package com.example.studycards;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface QuizSetWithQuestionsDAO {

    @Query("SELECT * FROM QuizSet")
    public List<QuizSetWithQuestions> getQuizSetWithQuestions();
}
