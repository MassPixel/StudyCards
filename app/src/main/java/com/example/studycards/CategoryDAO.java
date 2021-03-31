package com.example.studycards;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CategoryDAO {

    @Query("SELECT categoryName FROM category")
    List<Category> getCategoryNames();

    @Insert
    public void insertCategory(String name, String description);

    @Delete
    public void deleteCategory(String name);
}
