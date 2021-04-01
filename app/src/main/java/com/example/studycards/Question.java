package com.example.studycards;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Question",
        foreignKeys = @ForeignKey(entity = Category.class,
        parentColumns = "CategoryID",
        childColumns = "Category",
        onDelete = ForeignKey.CASCADE))

public class Question {
    @PrimaryKey
    @NonNull
    public int QuestionID;

    @ColumnInfo
    @NonNull
    public String QuestionText;

    @ColumnInfo
    public String AnswerText;

    @ColumnInfo
    public int Category;

    public void setQuestionID(int questionID) {
        QuestionID = questionID;
    }

    public void setQuestionText(String questionText) {
        QuestionText = questionText;
    }

    public void setAnswerText(String answerText) {
        AnswerText = answerText;
    }

    public void setCategory(int category) {
        Category = category;
    }

}
