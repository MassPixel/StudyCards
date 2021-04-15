package com.example.myapplication1.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Question {
    @PrimaryKey (autoGenerate = true)
    public int QuestionID;

    @ColumnInfo
    public String QuestionText;

    @ColumnInfo
    public String AnswerText;

}
