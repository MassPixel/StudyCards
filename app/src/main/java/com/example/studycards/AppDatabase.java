package com.example.studycards;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Category.class, Question.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract CategoryDAO categoryDAO();

    public abstract QuestionDAO questionDAO();

    /*public abstract QuizSetDAO quizSetDAO();*/
}
