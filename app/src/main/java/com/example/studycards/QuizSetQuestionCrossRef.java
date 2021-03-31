package com.example.studycards;

import androidx.room.Entity;

@Entity(primaryKeys = {"QuestionID", "QuizSetID"})
public class QuizSetQuestionCrossRef {
    public int QuestionID;
    public int QuizSetID;

}
