package com.example.myapplication1.data;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.RoomWarnings;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CategoryDAO {

    @Query("SELECT categoryID, categoryName FROM category")
    @SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
    List<Category> getCategoryNames();

    @Update
    public void updateCategory(Category category);

    @Query("INSERT INTO Category (CategoryName, CategoryDescription) VALUES (:value1, :value2)")
    public void addCategory(String value1, String value2);

    @Query("DELETE FROM Category WHERE CategoryName = :name")
    public void deleteCategory(String name);
}
