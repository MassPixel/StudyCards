package com.example.studycards;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CategoryWithQuestionsDAO {
    @Query("SELECT * FROM Category")
    public List<CategoryWithQuestions> getCategoryWithQuestions();
}
