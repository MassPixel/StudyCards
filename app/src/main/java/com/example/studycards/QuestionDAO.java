package com.example.studycards;

import androidx.room.Insert;

public interface QuestionDAO {

    @Insert
    public void insertQuestion(String text, String answer, int categoryID);


}
