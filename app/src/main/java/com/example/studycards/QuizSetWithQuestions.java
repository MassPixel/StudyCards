package com.example.studycards;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Junction;
import androidx.room.Query;
import androidx.room.Relation;
import androidx.room.Transaction;

import java.util.List;

@Entity(tableName = "QuizSetWithQuestions")
public class QuizSetWithQuestions {
    @Embedded public QuizSet quizset;
    @Relation(
            parentColumn = "QuizSetID",
            entityColumn = "QuestionID",
            associateBy = @Junction(QuizSetQuestionCrossRef.class)
    )
    public List<Question> questions;

}
