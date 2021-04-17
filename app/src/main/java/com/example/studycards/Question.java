package com.example.studycards;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "Question")
public class Question implements Serializable {

    // Should allow for the id column to be maintained by the database internally
    @PrimaryKey(autoGenerate = true)
    private int questionId;

    public void setId(int id) {
        this.questionId = id;
    }

    public int getId() {
        return questionId;
    }

    @ColumnInfo
    public String QuestionText;

    @ColumnInfo
    public String AnswerText;


}
