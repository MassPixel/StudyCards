package com.example.studycards;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CategoryDAO {

    @Query("SELECT categoryID, categoryName FROM category")
    List<Category> getCategoryNames();

    @Update
    public void updateCategory(Category category);

    @Query("INSERT INTO Category (CategoryName, CategoryDescription) VALUES (:value1, :value2)")
    public void addCategory(String value1, String value2);

    @Query("DELETE FROM Category WHERE CategoryName = :name")
    public void deleteCategory(String name);
}
