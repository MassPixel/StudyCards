package com.example.studycards;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

//App database entity
@Database(entities = {Question.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase appDB;

    private static String DATABASE_NAME = "StudyCardsDatabase";

    public synchronized static AppDatabase getInstance(Context context){
        //Checks to see if database has been initialized
        if(appDB == null){
            //Creates build of database
            appDB = Room.databaseBuilder(context.getApplicationContext()
            ,AppDatabase.class,DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return appDB;
    }

    public abstract QuestionDAO questionDAO();



    /*    public abstract CategoryDAO categoryDAO();*/
    /*public abstract QuizSetDAO quizSetDAO();*/
}
