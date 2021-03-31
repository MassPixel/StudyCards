package com.example.studycards;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Question.class,
        parentColumns = "CategoryID",
        childColumns = "Category",
        onDelete = ForeignKey.CASCADE))

public class Question {
    @PrimaryKey
    public int QuestionID;

    @ColumnInfo
    public String QuestionText;

    @ColumnInfo
    public String AnswerText;

    @ColumnInfo
    public int Category;
}
