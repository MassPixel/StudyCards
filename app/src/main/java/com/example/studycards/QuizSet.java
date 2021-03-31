package com.example.studycards;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = QuizSet.class,
        parentColumns = "QuestionID",
        childColumns = "Question",
        onDelete = ForeignKey.CASCADE))
public class QuizSet {
    @PrimaryKey
    public int QuizSetID;

    @ColumnInfo
    public String QuizSetName;

    @ColumnInfo
    public int Question;
}
