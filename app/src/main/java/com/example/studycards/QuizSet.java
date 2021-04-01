package com.example.studycards;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "QuizSet",
        foreignKeys = @ForeignKey(entity = QuizSet.class,
        parentColumns = "QuestionID",
        childColumns = "Question",
        onDelete = ForeignKey.CASCADE))
public class QuizSet {
    @PrimaryKey
    public int QuizSetID;

    @ColumnInfo
    @NonNull
    public String QuizSetName;

    @ColumnInfo
    public int Question;
}
